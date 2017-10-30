package com.controller;

import com.domain.doItTea;
import com.domain.student;
import com.domain.teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class controllerTea {
    @Autowired
    public doItTea doItTea;

    /**
     * 教师更改密码,,密码更改完成,下面的两个
     * @param model
     * @param teacher
     * @return
     */
    @RequestMapping("/teacher_changePasswd")
    public String teacher_changePasswd(Model model , teacher teacher) {
        model.addAttribute("teacher" ,teacher);
        return "teacher_changePasswd";
    }
    @RequestMapping("/teacher_changePasswdSuccess")
    public String teacher_changePasswdResult(RedirectAttributes redirect,Model model , teacher teacher) throws Exception{
        int flag;
        if(teacher.getName().equals(teacher.getPassword()) ){
            doItTea.update_T(teacher);
            flag = 21;
            redirect.addFlashAttribute("flag",flag);
            return "redirect:/teacher_changePasswordSuccess";
        }else {
            flag = 22;
            model.addAttribute("flag" ,flag);
            return "passwd_changeResultTS";
        }

    }
    /**
     * 修改密码成功
     */
    @RequestMapping("/teacher_changePasswordSuccess")
    public String teacher_PasswdSuccess() {
        return "passwd_changeResultTS";
    }

    /**
     * 调取全部的学生信息
     * @param model

     * @return
     * @throws Exception
     */
    @RequestMapping("/teacher_allSelectStu")
    public String teacher_allSelectStu(Model model ) throws Exception{
        List<student> listStu = doItTea.queryAllStudent();
        model.addAttribute("listStu" ,listStu);
        return "teacher_allSelectStu";
    }


    /**
     * 用来将修改成绩  ,单个修改,用来显示一个学生的信息
     */
    @RequestMapping("/teacher_writeScoreOne/{id}")
    public String teacher_writeScoreOne(Model model,@PathVariable int id) throws Exception{
        student student = doItTea.queryOneStu(id);
        model.addAttribute("stu" ,student);
        return "teacher_writeScoreOne";
    }


    /**
     * 表单提交过来之后,进行数据库修改
     * 添加成绩成功,之后跳转到teacher_selectAllstu,
     */

    @RequestMapping("/teacher_writerSuccess")
    public String teacher_writerSuccess (student stu) throws Exception {
        doItTea.writeScore(stu);
        return "redirect:/teacher_allSelectStu";
    }

    /**
     * 返回补考名单
     */
    @RequestMapping("/query_notPass")
    public String query_notPass(Model model) throws Exception {
        List<student> listStu = doItTea.queryAllStudent();
        model.addAttribute("listStu" ,listStu);
        return "teacher_notPassExam";
    }

    /**
     * 用来返回教师的主页面
     */
    @RequestMapping("/backTeacher_joinIN")
    public String backTeacher_joinIN() {
        return "teacher_joinIn";
    }


}
