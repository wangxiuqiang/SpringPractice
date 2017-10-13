package com.controller;

import com.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpServletRequest;
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
//    @RequestMapping(value = "/tsJoin_in")
//    public String TSJoin(Model model,  JoinTS joinTS) {
//
//        model.addAttribute("joinTS",joinTS);
//        return "indexTS";
//
//    }
    /*
    flag 用来判断是学生还是老师登录 1 老师 0 学生
     */
    @RequestMapping(value = "/tsJoin_in/{flag}")
    public String WhoJoinIn(@PathVariable int flag , Model model,JoinTS joinTS) throws  Exception{
        if(flag == 1){
            if(joinTS == null){
                return "failure";
            }
            else{
                boolean tOrf = doIt.joinMessageTeacher(joinTS);
                if (tOrf == true){
                    return "success";
                }else {
                    return "failure";
                }
            }
        }else{
            if(joinTS == null){
                return "failure";
            }
            else{
                boolean tOrf = doIt.joinMessageStudent(joinTS);
                if (tOrf == true){
                    return "success";
                }else {
                    return "failure";
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
        if(joinIN == null ){
            model.addAttribute("a","b");
            model.addAttribute("admin",joinIN);
            model.addAttribute("admin2",join);
            return "failure";
        }else {
            if(joinIN.getName().equals(join.getName()) && joinIN.getPassword().equals(join.getPassword())){
                return "adminIN";
            }
            else {
                model.addAttribute("a","a");
                model.addAttribute("admin",joinIN);
                model.addAttribute("admin2",join);
                return "failure";
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
       else if(flag == 0) {
            model.addAttribute("student",student);
            model.addAttribute("flag" ,flag);
            return "addInformationS";
        }
        else{
            return "failure";
        }
    }

    /*
        点击提交后的信息录入数据库
     */
    @RequestMapping(value = "addSubmit_Information/{flag}")
    public String addSuccessOrFailure(@PathVariable int flag,student student, teacher teacher, RedirectAttributes redirect ){

        redirect.addFlashAttribute("flag",flag);
        if(flag == 1) {
            if(teacher == null){
                return "failure";
            }
            else {
                //执行写入函数 参数为teacher
                redirect.addFlashAttribute("teacher", teacher);
                return "redirect:/success_add";//防止出现刷新页面再次添加的事件,用重定向
            }
        }else if(flag == 0){
            //执行写入函数 , 参数发生变化 用student对象
            if(student == null){
                return "failure";
            }else {
                redirect.addFlashAttribute("student", student);
                return "redirect:/success_add";
            }
        }else {
            return "failure";
        }

    }
     /*
     添加成功页面
      */
    @RequestMapping(value = "/success_add")
    public String successAdd() {
       return "successAdd";
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
        return "success";
    }
}
