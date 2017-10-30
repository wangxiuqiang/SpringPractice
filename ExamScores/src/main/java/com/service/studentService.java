package com.service;

import com.domain.student;

public interface studentService {
    public void writeInfoExam(student student)throws Exception;
    public student update_S(student student) throws  Exception;
    public String queryDate(int id) throws Exception;
}
