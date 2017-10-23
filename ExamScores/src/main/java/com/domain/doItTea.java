package com.domain;

import com.service.adminService;
import com.service.teacherService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class doItTea {
    private SqlSessionFactory sqlSessionFactory;
    public void SetUp() throws  Exception{
        String resource = "/com/service/SqlConfigMapp.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    /**
     * 查询单个的学生信息
     */
    public student queryOneStu(int id) throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        teacherService teacherService = sqlSession.getMapper(com.service.teacherService.class);
        student student = teacherService.queryOneStu(id);
        return student;
    }

    /**
     * 更改密码
     * @param teacher
     * @throws Exception
     */

    public void update_T(teacher teacher) throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        teacherService teacherService =sqlSession.getMapper(com.service.teacherService.class);
        teacherService.update_T(teacher);
        sqlSession.commit();
        sqlSession.close();
    }
    /**
     * 返回全部学生信息的方法,通过调用adminService
     */
    public List<student> queryAllStudent() throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
         adminService adminService = sqlSession.getMapper(com.service.adminService.class);
        List<student> students = adminService.queryAllForStudent();
        sqlSession.close();
        return students;
    }

}
