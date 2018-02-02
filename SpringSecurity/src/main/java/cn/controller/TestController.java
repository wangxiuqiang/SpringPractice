package cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/")
    public String login(){
        return "Index";
    }

    @RequestMapping("/test")
    public String a(){
        return "LoginIndex";
    }

    @RequestMapping("/index")
    public String Index() {
        return "Index";
    }
    @RequestMapping("/failure")
    public String failure() {
        return "failure";
    }

}
