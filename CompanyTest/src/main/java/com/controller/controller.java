package com.controller;

import com.domain.admin;
import com.domain.department;
import com.domain.staff;
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

    @RequestMapping( value = "/manager/{jspid}/{infoid}")
    public String addStaff(@PathVariable int infoid ,@PathVariable int jspid, Model model){
        switch(jspid) {
            case 1:
                 model.addAttribute("id",infoid); return "addStaff";
            case 2:
                model.addAttribute("id",infoid); return "delectStaff";
            case 3:
                model.addAttribute("id",infoid); return "queryStaff";
            case 4:
                model.addAttribute("id",infoid);  return "updateStaff";
                default:return "default";
        }
    }


    @RequestMapping(value ="/change_view/{id}")
    public String change(@PathVariable int id, Model model ,HttpServletRequest request){
        department dept = new department();
        dept.setId(id);
        switch(id){
            case 1 :   dept.setName("总裁");break;
            case 2 :   dept.setName("副总裁");break;
            case 3 :   dept.setName("秘书部");break;
            case 4 :   dept.setName("人事部");break;
            case 5 :   dept.setName("销售部");break;
            case 6 :   dept.setName("后勤部");break;
            case 7 :   dept.setName("业务部");break;
        }
        model.addAttribute("dept",dept);
        return "departmentManager";
    }
    @RequestMapping(value="/adminJoin_in")
    public String adminJoin(Model model){

        model.addAttribute("admin",new admin());
        return "index";
    }
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


}
