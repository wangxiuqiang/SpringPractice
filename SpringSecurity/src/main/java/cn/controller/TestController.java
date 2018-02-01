package cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/welcome")
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

    @RequestMapping("/login")
    public String Login(@RequestParam(value = "error",required = false) String error ) {
        if (error != null) {
            return "failure";
        }else{
            return "Index";
        }
    }
}
