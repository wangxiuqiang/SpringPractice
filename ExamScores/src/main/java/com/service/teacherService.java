package com.service;

import com.domain.student;
import com.domain.teacher;

import java.util.List;

public interface teacherService {
    public student queryOneStu(int id) throws Exception;
    public teacher update_T(teacher teacher) throws  Exception;

}
