package com.controller;

import com.domain.admin;
import com.service.userService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wxq on 17-8-6.
 */
@Controller
public class controller {

    @RequestMapping(value ="/change_view/{id}")
    public String change(@PathVariable int id , Model model){
        if(id == 1){
            return "test";
        }
        else{
            return "index";
        }
    }
    @RequestMapping(value="/adminJoin_in")
    public String adminJoin(Model model){

        model.addAttribute("admin",new admin());
        return "index";
    }
    @RequestMapping(value = "/join_in")
    public String In( admin admin,Model model) {
        ApplicationContext a = new ClassPathXmlApplicationContext("../../WEB-INF/springmvc-config.xml");
       userService userService = (userService) a.getBean("userService");
       admin admin1 = userService.adminJoin();
       if(admin == null){
           return "index";
       }
       else{
           if(admin1.getName().equals(admin.getName())  && admin1.getPassword().equals(admin.getPassword())){
               model.addAttribute("admin" ,admin);
               return "CompanyShow";
           }
           else{
               return "index";
           }
       }

    }
}
