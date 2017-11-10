package cn.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String index() {
        System.out.println("index");
        return "index";
    }

    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        System.out.println(page);
        return page;
    }
}
