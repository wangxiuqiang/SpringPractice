package cn.ssm.controller;

import cn.ssm.po.TestDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping(value="/")
    public String testDate(Model model) {
        return  "index";
    }

    @RequestMapping(value="/success")
    public String success(Model model, TestDate testDate , BindingResult bindingResult) {
       if(bindingResult.hasErrors()){
           model.addAttribute("error" , "出错");
           return "index";
       }
        model.addAttribute("testDate" ,testDate);
        return  "success";
    }
}
