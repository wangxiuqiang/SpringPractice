package com.controller;

import com.domain.admin;
import com.domain.department;
import com.domain.staff;
import com.service.setDepartment;
import com.service.userService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wxq on 17-8-6.
 */
@Controller
public class controller {

    /*
       manager 用来跳转到指定的增删改查页面 jspid负责具体跳转到哪个页面
        //infoid 用来标记哪个部门的成员
        用infoid来将部门初始化,并且添加到model中
     */
    @RequestMapping( value = "/manager/{jspid}/{infoid}")
    public String addStaff(@PathVariable int infoid ,@PathVariable int jspid, Model model){
        setDepartment setDept = new setDepartment();
        department dept = setDept.setDept(infoid);
        model.addAttribute("dept",dept);
        switch(jspid) {
            case 1:
                 model.addAttribute("staff",new staff());
                return "addStaff";
            case 2:
               // model.addAttribute("id",infoid);
                return "delectStaff";
            case 3:
                //model.addAttribute("id",infoid);
                return "queryStaff";
            case 4:
               // model.addAttribute("id",infoid);
                return "updateStaff";
            default:
                    return "default";
        }
    }


    /*
    change_view  用来获取传过来的id,作为部门的id,并且根据id将name值赋值,将部门对象添加到Model中在页面中调用
    跳转到部门管理页面,进行增删改查
    setDepartment 用来将部门对象初始化
     */
    @RequestMapping(value ="/change_view/{id}")
    public String change(@PathVariable int id, Model model ){
        setDepartment setDept = new setDepartment();
        department dept = setDept.setDept(id);
        model.addAttribute("dept",dept);
        return "departmentManager";
    }

    /*
      adminJoin_in 负责将表单输入的值保存在一个admin对象中,并跳转到登录表单页面
     */
    @RequestMapping(value="/adminJoin_in")
    public String adminJoin(Model model){

        model.addAttribute("admin",new admin());
        return "index";
    }
    /*
     join_in负责从把从数据库提取出来的值和表单输入传过来的值对比,登录成功建返回到主页面,不成功就返回到登录失败页面
     request 的提交方法可以在页面使用 javaBean代码
     */
    @RequestMapping(value = "/join_in")
    public String In( admin admin,Model model , HttpServletRequest request) {
        ApplicationContext a = new ClassPathXmlApplicationContext("../../WEB-INF/springmvc-config.xml");
       userService userService = (userService) a.getBean("userService");
       admin admin1 = userService.adminJoin();
       if(admin == null){
           request.setAttribute("admin",admin);
           return "default";
       }
       else{
           if(admin1.getName().equals(admin.getName())  && admin1.getPassword().equals(admin.getPassword())){
               model.addAttribute("admin" ,admin);
               return "CompanyShow";
           }
           else{
               request.setAttribute("admin",admin);
               return "default";
           }
       }

    }


    @RequestMapping(value = "add_Staff")
    public String addStaff(staff staff ,Model model){
        if(staff == null){
            return "test1";
        }
        else {
            model.addAttribute("staff",staff);
            return "test";
        }
    }

}
