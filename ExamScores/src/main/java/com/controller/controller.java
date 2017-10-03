package com.controller;

import com.domain.Join;
import com.domain.student;
import com.domain.teacher;
import com.domain.doIt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by wxq on 17-9-13.
 */
@Controller
public class controller {

    @Autowired
    public  doIt doIt;

   /*
   登录页面用来登录 用join对象来提供登录信息
    */
    @RequestMapping(value = "/join_in")
    public String JoinIn(Model model, Join join) {
        model.addAttribute("join", join);
        return "index";

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
    public String addInformation(student student, teacher teacher , Model model , HttpServletRequest request, @PathVariable int flag){
        if(flag == 1) {
            model.addAttribute("teacher" , teacher);
            model.addAttribute("flag" ,flag);
            return "addInformation";
        }
       else if(flag == 0) {
            model.addAttribute("student",student);
            model.addAttribute("flag" ,flag);
            return "addInformation";
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
    public String queryInformation(@PathVariable int flag , Model model){


        return "showInformation";
    }
    @RequestMapping(value = "/update_delete/{flag}")
    public String updateAndDelect(@PathVariable int flag ,Model model){

        return "updateAndDelete";
    }
}
