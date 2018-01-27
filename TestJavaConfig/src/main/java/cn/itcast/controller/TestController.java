package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

    @RequestMapping(value = "/")
    public String homeIndex() {
        return "home";
    }

    @RequestMapping(value = "/login")
    public String index() {
        return "home";
    }
}
