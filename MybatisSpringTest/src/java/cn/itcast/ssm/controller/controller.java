package cn.itcast.ssm.controller;

import cn.itcast.ssm.service.impl.moviesImplClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
    @Autowired
    moviesImplClass moviesImplClass;

    @RequestMapping( value = "query" )
    public String query(Model model) throws Exception{
        String name = moviesImplClass.queryInfo();
        model.addAttribute("name" ,name);
        return "index";
    }

}
