package cn.ssm.controller;

import cn.ssm.po.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {


    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/query")
    public String query() {
        return "index";
    }

    @RequestMapping(value = "/requestJson")
    public @ResponseBody test requestJson(@RequestBody test test) {
        return test;
    }

    @RequestMapping(value = "/responseJson")
    public  @ResponseBody test responseJson(test test) {
        return test;
    }
}
