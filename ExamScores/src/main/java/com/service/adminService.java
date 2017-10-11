package com.service;

import com.domain.Join;
import com.domain.JoinTS;
import com.domain.student;
import com.domain.teacher;

import java.util.List;

public interface adminService {
    public Join adminJoinIn() throws Exception;
    public List<teacher> queryAllForTeacher() throws Exception;
    public List<student> queryAllForStudent() throws Exception;
    public List<JoinTS> joinMessageTeacher() throws  Exception;
    public List<JoinTS> joinMessageStudent() throws  Exception;
}
