package com.controller;

import com.domain.admin;
import com.domain.department;
import com.domain.staff;
import com.service.setDepartment;
import com.service.userService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wxq on 17-8-6.
 */
@Controller
public class controller {

    /*
       manager 用来跳转到指定的增删改查页面 jspid负责具体跳转到哪个页面
        //infoid 用来标记哪个部门的成员
        用infoid来将部门初始化,并且添加到model中
     */
    @RequestMapping( value = "/manager/{jspid}/{infoid}")
    public String addStaff(@PathVariable int infoid ,@PathVariable int jspid, Model model){
        setDepartment setDept = new setDepartment();
        department dept = setDept.setDept(infoid);
        model.addAttribute("dept",dept);
        switch(jspid) {
            case 1:
                model.addAttribute("staff",new staff());
                return "addStaff";
            case 2:
               model.addAttribute("staffId", new staff());
               return "delectStaff";
            case 3:
                //model.addAttribute("id",infoid);
                return "queryStaff";
            case 4:
                //model.addAttribute("id",infoid);
                return "updateStaff";
            default:
                    return "default";
        }
    }


    /*
    change_view  用来获取传过来的id,作为部门的id,并且根据id将name值赋值,将部门对象添加到Model中在页面中调用
    跳转到部门管理页面,进行增删改查
    setDepartment 用来将部门对象初始化
     */
    @RequestMapping(value ="/change_view/{id}")
    public String change(@PathVariable int id, Model model ){
        setDepartment setDept = new setDepartment();
        department dept = setDept.setDept(id);
        model.addAttribute("dept",dept);
        return "departmentManager";
    }

    /*
      adminJoin_in 负责将表单输入的值保存在一个admin对象中,并跳转到登录表单页面
     */
    @RequestMapping(value="/adminJoin_in")
    public String adminJoin(Model model){

        model.addAttribute("admin",new admin());
        return "index";
    }
    /*
     join_in负责从把从数据库提取出来的值和表单输入传过来的值对比,登录成功建返回到主页面,不成功就返回到登录失败页面
     request 的提交方法可以在页面使用 javaBean代码
     */
    @RequestMapping(value = "/join_in")
    public String In( admin admin,Model model , HttpServletRequest request) {
        ApplicationContext a = new ClassPathXmlApplicationContext("../../WEB-INF/springmvc-config.xml");
       userService userService = (userService) a.getBean("userService");
       admin admin1 = userService.adminJoin();
       if(admin == null){
          request.setAttribute("flag","join");
           request.setAttribute("admin",admin);
           return "default";
       }
       else{
           if(admin1.getName().equals(admin.getName())  && admin1.getPassword().equals(admin.getPassword())){
               model.addAttribute("admin" ,admin);
               return "CompanyShow";
           }
           else{
               request.setAttribute("admin",admin);
               return "default";
           }
       }

    }

    /*
     * 添加员工的信息,如果为空就返回default页面,如果添加不成功也执行default页面
     * 添加成功就返回success页面,提示成功
     * id 的作用是部门编号,保证添加的员工的部门正确
     * @param id
     * @param staff
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "add_Staff/{id}")
    public String addStaff(@PathVariable int id, staff staff ,Model model,HttpServletRequest request){
        if(staff == null){
            model.addAttribute("flag","输入不能为空");
            return "default";
        }
        else {
            model.addAttribute("staff",staff);
            ApplicationContext a = new ClassPathXmlApplicationContext("../../WEB-INF/springmvc-config.xml");
            userService userService = (userService) a.getBean("userService");
            int i = userService.addStaff(staff,id);
            request.setAttribute("flag","add");
            String str = "输入的员工信息:\n员工编号:" + staff.getId() + "\n员工姓名:"
                    + staff.getName() + "\n员工电话:" + staff.getTel() + "\n员工薪水"
                    +staff.getMoney();
            if(i != 0) {
                model.addAttribute("str", str);
                model.addAttribute("id",id);
                return "success";
            }
            else{
                model.addAttribute("default" ,"添加失败");
                return "default";
            }

        }
    }

    /*
     * id 负责表示部门 ,
     * @param id
     * @param
     * @param model
     * @return
     */
    @RequestMapping(value ="delete_staff/{id}")
    public String deleteStaff(@PathVariable int id , staff staffId , Model model ){
        ApplicationContext a = new ClassPathXmlApplicationContext("../../WEB-INF/springmvc-config.xml");
        userService userService = (userService) a.getBean("userService");
        String str;
        int i = userService.deleteStaff(id, staffId.getId());
        if(i != 0){
            str = "删除成功.";
            model.addAttribute("id",id);
            model.addAttribute("str",str);
            return "success";
        } else {
          str = "删除失败.";
          model.addAttribute("str",str);
          return "default";
        }
    }

}
