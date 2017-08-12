package com.controller;

import com.domain.admin;
import com.service.userService;
import javafx.print.Printer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wxq on 17-8-6.
 */
@Controller
public class controller {


    @RequestMapping(value="/admin_join")
    public String adminJoin(admin admin,Model model){

        model.addAttribute("admin",admin);
        return "index";
    }
    @RequestMapping(value = "/join_in")
    public String In( admin admin,Model model) {
        userService in = new userService();
        try{
        String[] JoinIn = in.adminJoin();
        if(JoinIn != null){
            return "index";
        }
      else{
          if (admin.getName().equals(JoinIn[0]) && admin.getPassword().equals(JoinIn[1])) {
            return "test";
        }else{
            return "index";
        }
        }

        }catch(Exception e){
            e.printStackTrace();
            return "index";
        }

    }
}
