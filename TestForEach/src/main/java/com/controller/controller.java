package com.controller;

import com.a.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxq on 17-8-7.
 */
@Controller
public class controller {

    @RequestMapping(value="/in_it")
    public String in(Model model){
        student s1 = new student("a","a");
        student s2 = new student("b","b");
        student s3 = new student("c","c");
        List<student> list = new ArrayList<student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        model.addAttribute("list",list);
        return "index";
    }

}
