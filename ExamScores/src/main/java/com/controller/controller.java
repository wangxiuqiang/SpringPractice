package com.controller;

import com.domain.Join;
import com.domain.student;
import com.domain.teacher;
import com.service.adminServiceImp;
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

    /*
       用来调用数据库操作的接口对象
     */
    @Autowired
    private adminServiceImp adminServiceimp;
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
    public String AdminIn(Model model, Join join) {
        if (join.getName().equals("admin") && join.getPassword().equals("admin")) {
            return "adminIN";
        } else {
            return "failure";
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
            request.setAttribute("flag" ,flag);
            return "addInformation";
        }
       else if(flag == 0) {
            model.addAttribute("student",student);
            request.setAttribute("flag" ,flag);
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


}
