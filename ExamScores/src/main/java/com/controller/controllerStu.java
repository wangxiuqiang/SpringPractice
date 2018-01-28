package com.controller;

import com.domain.doItStu;
import com.domain.doItTea;
import com.domain.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class controllerStu {

  @Autowired
  doItTea doItTea;

    /**
     * 学生查询成绩的控制,  传过来的独立路径是要求的编号,直接查出来返回
     */
    @RequestMapping("/student_scoreSelect/{id}")
    public String student_scoreSelect(Model model, @PathVariable int id) throws Exception{
        student student = doItTea.queryOneStu(id);
        model.addAttribute("stu" ,student);
        return "student_scoreQuery";
    }

    /**
     * 考试报名,
     */
    @RequestMapping(value = "/student_exam/{id}" )
    public String student_exam(Model model,@PathVariable int id , student student) {
        model.addAttribute("stu",student);
        model.addAttribute("id",id);
        return "student_exam";
    }


    @Autowired
    doItStu doItStu;
    /**
     * 报名成功显示报名信息  ,
     */
    @RequestMapping("/student_examSuccess/{id}")
    public String student_examSuccess(@PathVariable int id, RedirectAttributes redirect , student student, Model model) throws Exception{
        int flag;
        model.addAttribute("id",id);
        if(id != student.getId()){
            flag = 1;
            model.addAttribute("flag",flag);
            return "student_examFailure";
        }else {
            if(!doItStu.queryDate(id).equals("2017-11-5")){
                doItStu.writeInfoExam(student);
                student stu =   doItTea.queryOneStu(id);
                redirect.addFlashAttribute("stu",stu);
                return "redirect:/student_queryExamSuccess";
            }else {
                flag = 0;
                model.addAttribute("flag",flag);
                return "student_examFailure";
            }

        }

    }
    @RequestMapping("/student_queryExamSuccess")
    public String student_queryExamSuccess() throws Exception{
        return "student_examSuccess";
    }
    /*
      学生更改密码
     */
    @RequestMapping(value = "/student_changePasswd")
    public String student_changePasswd(Model model,student student) throws Exception{
        model.addAttribute("stu",student);
        return "student_changePasswd";
    }
    @RequestMapping("/student_changePasswdSuccess")
    public String student_changePasswdResult(RedirectAttributes redirect,Model model ,student student) throws Exception{
        int flag;
        if(student.getName().equals(student.getPassword()) ){
            doItStu.update_S(student);
            flag = 11;
            redirect.addFlashAttribute("flag",flag);
            return "redirect:/student_changePasswordSuccess";
        }else {
            flag = 12;
            model.addAttribute("flag" ,flag);
            return "passwd_changeResultTS";
        }

    }

    @RequestMapping("/student_changePasswordSuccess")
    public String student_PasswdSuccess() {
        return "passwd_changeResultTS";
    }

    /**
     * 返回登录后的界面
     * @return
     */
    @RequestMapping(value = "/student_backJoinIN/{id}")
    public String student_backJoinIN(Model model , @PathVariable int id) {
        model.addAttribute("id",id);
        return "student_joinIN";
    }


}
