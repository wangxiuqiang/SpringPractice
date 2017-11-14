package cn.ssm.controller;

import cn.ssm.po.validationTest;
import cn.ssm.service.queryName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FirstController {

    @Autowired
    queryName queryNameImpl;

    @RequestMapping(value="/")
    public String qu(Model model) throws Exception{
        String name = queryNameImpl.queryNameFromMovies();
        model.addAttribute("name",name);
        return "index";
    }

    @RequestMapping(value="/query")
    public String query(Model model) throws Exception{
        String name = queryNameImpl.queryNameFromMovies();
        model.addAttribute("name",name);
        return "index";
    }

    @RequestMapping(value="/validation")
    public String validation(Model model, @Validated validationTest validation, BindingResult bindingResult) throws Exception{

        model.addAttribute("validation" ,validation);
        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            model.addAttribute("allErrors" ,allErrors);
            return "index";
        }else {
            return "success";
        }
    }
}
