package cn.ssm.controller;

import cn.ssm.service.MoviesQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @Autowired
    MoviesQuery moviesQueryImpl;
   @RequestMapping("/success")
    public String success( Model model) throws Exception{
       String name = moviesQueryImpl.queryMovies();
       model.addAttribute("name",name);
       return "index";
   }
}
