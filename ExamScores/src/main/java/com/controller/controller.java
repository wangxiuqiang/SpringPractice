package com.controller;

import com.domain.Join;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wxq on 17-9-13.
 */
@Controller
public class controller {

    @RequestMapping(value = "/join_in")
    public String JoinIn(Model model, Join join) {
        model.addAttribute("join", join);
        return "index";

    }

    @RequestMapping(value = "/success_in")
    public String AdminIn(Model model, Join join) {
        if (join.getName().equals("admin") && join.getPasswd().equals("admin")) {
            return "adminIN";
        } else {
            return "failure";
        }
    }
}
