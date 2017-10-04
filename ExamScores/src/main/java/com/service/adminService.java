package com.service;

import com.domain.Join;
import com.domain.teacher;

import java.util.List;

public interface adminService {
    public Join adminJoinIn() throws Exception;
    public List<teacher> queryAllForTeacher() throws Exception;

}
