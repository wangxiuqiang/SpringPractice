package cn.controller;

import cn.pojo.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class TestController {
    @RequestMapping("/")
    public String index(Test test,Model model) {
        model.addAttribute("test",test);
        return "index";
    }

    @RequestMapping("/login")
    public String login(@Valid Test test, Errors errors, Model model) {
        model.addAttribute("test",test);
        model.addAttribute("errors",errors);
        if(errors.hasErrors()){
            return "index";
        }else{
            return "urlTestSuccess";
        }

    }
    @RequestMapping("/urlTestSuccess")
    public String urlTest(){
        return "urlTestSuccess";
    }
}
