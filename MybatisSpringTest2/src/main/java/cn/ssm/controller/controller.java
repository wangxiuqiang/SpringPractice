package cn.ssm.controller;

import cn.ssm.service.TestService;
import cn.ssm.service.queryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class controller {

    @Autowired
    public queryService queryService;
    @Autowired
    TestService testService4qq;
    @Autowired
    TestService testService4sina;
    @Autowired
    TestService testServiceImpl;

    @RequestMapping(value = "/queryInfo")
    public String queryInfo(Model model) throws Exception{
      String name =  queryService.queryName();
      model.addAttribute("name",name);
        return "index";
    }

    @RequestMapping("/test")
    public void test(HttpServletResponse response) throws IOException {
        System.out.println("test");
        testService4qq.test();
        testService4sina.test();
        response.getWriter().print("successful");
    }


}
