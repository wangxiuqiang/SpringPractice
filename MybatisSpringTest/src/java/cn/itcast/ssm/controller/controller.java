package cn.itcast.ssm.controller;


import cn.itcast.ssm.service.impl.moviesImplClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @Autowired
    public moviesImplClass implClass;

    @RequestMapping( value = "/" )
    public String query(Model model) throws Exception{
        String name = implClass.selectName();
        model.addAttribute("name" ,name);
        return "index";
    }

//    @RequestMapping( value = "/query" )
//    public String query(Model model) throws Exception{
//        String name = implClass.selectName();
//        model.addAttribute("name" ,name);
//        return "index";
//    }

}
