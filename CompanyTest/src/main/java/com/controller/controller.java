package com.controller;

import com.domain.admin;
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
        if (admin.getName().equals("admin") && admin.getPassword().equals("admin")) {
            return "test";
        }else{
            return "index";
        }
    }
}
