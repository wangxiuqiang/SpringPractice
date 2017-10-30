package com.controller;

import com.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Created by wxq on 17-9-13.
 */
@Controller
public class controller {


    /**
     *
     doIt 的获取需要从spring的配置文件中找到需要bean ,然后在doIt 的类上用Service标注

     */

    @Autowired
    public  doIt doIt;

   /*
   登录页面用来登录 用join对象来提供管理员登录信息
    */
    @RequestMapping(value = "/join_in/{flag}")
    public String JoinIn(Model model, Join join, JoinTS joinTS, @PathVariable int flag) {

        if(flag == 0 ){
            model.addAttribute("joinTS",joinTS);
            return "indexS";
        }else if(flag == 1){
            model.addAttribute("joinTS",joinTS);
            return "indexT";
        }else{
            model.addAttribute("join", join);
            return "index";
        }




    }

    /*
    flag 用来判断是学生还是老师登录 1 老师 0 学生
     */
    @RequestMapping(value = "/tsJoin_in/{flag}")
    public String WhoJoinIn(@PathVariable int flag , Model model,JoinTS joinTS) throws  Exception{
        model.addAttribute("joinTs",joinTS);
        int flagJoin;
        if(flag == 1){
            if(joinTS == null){
                flagJoin = 21;
                model.addAttribute("flagJoin",flagJoin);
                return "joinIn_failure";
            }
            else{
                boolean tOrf = doIt.joinMessageTeacher(joinTS);
                if (tOrf == true){
                    return "teacher_joinIn";
                }else {
                    flagJoin = 22;
                    model.addAttribute("flagJoin",flagJoin);
                    return "joinIn_failure";
                }
            }
        }else{
            if(joinTS == null){
                flagJoin = 11;
                model.addAttribute("flagJoin",flagJoin);
                return "joinIn_failure";
            }
            else{
                boolean tOrf = doIt.joinMessageStudent(joinTS);
                if (tOrf == true){
                    return "student_joinIN";
                }else {
                    flagJoin = 12;
                    model.addAttribute("flagJoin",flagJoin);
                    return "joinIn_failure";
                }
            }
        }

    }
/*
        用来测试登录是否成功
 */
    @RequestMapping(value = "/success_in")
    public String AdminIn(Model model, Join join) throws Exception {
        Join  joinIN  =  doIt.adminJoinInIt();
        int flagJoin;
        if(joinIN == null ){
            flagJoin = 31;
            model.addAttribute("flagJoin",flagJoin);
            return "joinIn_failure";
        }else {
            if(joinIN.getName().equals(join.getName()) && joinIN.getPassword().equals(join.getPassword())){
                return "adminIN";
            }
            else {
                flagJoin = 32;
                model.addAttribute("flagJoin",flagJoin);
                return "joinIn_failure";
            }
        }
    }

    /*
    用来添加学生老师的信息的表单
    flag 代表是老师还是学生,1 是老师 ,0 代表学生
     */
    @RequestMapping(value="/add_information/{flag}")
    public String addInformation(student student, teacher teacher , Model model ,@PathVariable int flag){
        if(flag == 1) {
            model.addAttribute("teacher" , teacher);
            model.addAttribute("flag" ,flag);
            return "addInformationT";
        }
       else {
            model.addAttribute("student",student);
            model.addAttribute("flag" ,flag);
            return "addInformationS";
        }
    }

    /*
        点击提交后的信息录入数据库
     */
    @RequestMapping(value = "addSubmit_Information/{flag}")
    public String addSuccessOrFailure(@PathVariable int flag,student student, teacher teacher, RedirectAttributes redirect ) throws  Exception{

        redirect.addFlashAttribute("flag",flag);
        if(flag == 1) {
            if(teacher == null){
                return "admin_addFailure";
            }
            else {
                //执行写入函数 参数为teacher
                doIt.insertT(teacher);
                redirect.addFlashAttribute("teacher", teacher);
                return "redirect:/success_add/1";//防止出现刷新页面再次添加的事件,用重定向
            }
        }else {
            //执行写入函数 , 参数发生变化 用student对象
            if(student == null){
                return "admin_addFailure";
            }else {
                doIt.insertS(student);
                redirect.addFlashAttribute("stu", student);
                return "redirect:/success_add/0";
            }
        }
    }

    /**
     * 显示学生和老师的信息,1 表示老师,0  表示学生
     */
    @RequestMapping(value = "/query_Information/{flag}")
    public String queryInformation(@PathVariable int flag , Model model) throws Exception{
        if(flag == 1) {
            List<teacher> listTeacher = doIt.queryAllTeacher();
            model.addAttribute("teachers",listTeacher);
        }
        if(flag == 0 ){
            List<student> listStudent = doIt.queryAllStudent();
            model.addAttribute("students",listStudent);
        }
        model.addAttribute("flag",flag);
        return "showInformation";
    }

    /**
     *
     * @param flag  表示是学生还是老师,  删除还是修改
     * 修改和删除的初始页面,如果返回的值是1,2, 就执行修改的部分,修改的部分也分为学生和老师,
     *              删除 一样 如果是0(学生),-1(老师),就执行delete的部分
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/update_delete/{flag}")
    public String updateAndDelect(@PathVariable int flag , Model model , key key) throws Exception {
        model.addAttribute("key",key);
        //model 和 modelmap效果一样
        if(flag == -1 || flag == 2) {
            List<teacher> listTeacher = doIt.queryAllTeacher();
            model.addAttribute("teachers",listTeacher);
        }
        if(flag == 0 || flag == 1){
            List<student> listStudent = doIt.queryAllStudent();
            model.addAttribute("students",listStudent);
        }
        model.addAttribute("flag",flag);
        return "updateAndDelete";
    }
    /*
    修改和删除的单个页面,如果返回的值是1,2, 就执行修改的部分,修改的部分也分为学生和老师,
     *              删除 一样 如果是0(学生),-1(老师),就执行delete的部分
     */
    @RequestMapping(value = "/OneQuery/{flag}")
    public String queryOne(Model model , @PathVariable int flag , key key) throws Exception{
        if(flag == 2 || flag == -1){
            // 老师的genre查询
            teacher teacher = doIt.queryOneTeacher(key);
            model.addAttribute("teacher",teacher);
        }else if(flag == 1 || flag == 0){
            //学生的个人查询
            student student = doIt.queryOneStudent(key);
            model.addAttribute("student",student);
        }
        return "";
    }

    /*
    单个删除 学生0, 老师1的信息
     */
    @RequestMapping(value = "/delete_TS/{flag}/{id}")
    public String delete_TS(@PathVariable int id,Model model,@PathVariable int flag) throws Exception{
        doIt.delete_TS(flag ,id);
        model.addAttribute("flag",flag);
        return "adminSuccess_delete";
    }
    /**
     * 更改信息 ,单个改1老师 0学生 跳转到修改页面
     */
    @RequestMapping("/update_TS/{flag}/{id}")
    public String update_TS(@PathVariable int id, @PathVariable int flag,Model model
                          ) throws  Exception{
        key key = new key();
        key.setId(id);
           if(flag  == 1){
              teacher teacher = doIt.queryOneTeacher(key);
              model.addAttribute("teacher",teacher);
               return "update_oneT";
           }else {
               student student =  doIt.queryOneStudent(key);
               model.addAttribute("student",student);
               return "update_oneS";
           }
    }
    /**
     * 更改信息 ,正式更改,跳转到成功页面,更改完的信息和添加完的信息都返回到同一个successAdd页面
     */
    @RequestMapping(value = "/update_success/{flag}")
    public String updateSuccess(RedirectAttributes redirect,teacher teacher,student student,@PathVariable int flag) throws  Exception{
        if(flag == 1) {
           doIt.update_TS(flag ,teacher,student);
            redirect.addFlashAttribute("teacher",teacher);
           return "redirect:/success_add/1";
        }
        else{
            doIt.update_TS(flag,teacher ,student);
            redirect.addFlashAttribute("stu",student);
            return "redirect:/success_add/0";
        }
    }

    /**
    添加成功页面
     **/
    @RequestMapping(value = "/success_add/{flag}")
    public String successAdd(@PathVariable int flag) {
        if(flag == 1){
            return "admin_successAdd_update";
        }else{
            return "admin_successAdd_updateS";
        }

    }

//    /**
//     * teacher 准备查询单个的学生,跳入单个学生的查询界面  取消了
//     */
//    @RequestMapping(value = "/teacher_selectOne")
//    public String teacher_selectOne(key key ,Model  model) {
//        model.addAttribute("key" ,key);
//        return "teacher_selectOne";
//    }
//    /**
//     * 上面跳转到页面后的查询  取消这个了
//     */
//    @RequestMapping("/teacher_selectSuccess")
//    public String teacher_selectOneSuccess(Model model ,key key) throws Exception {
//       student student = doItTea.queryOneStu(key);
//       model.addAttribute("student",student);
//        return "update_oneS";
//    }

}
