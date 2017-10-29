package com.domain;

import com.service.studentService;
import com.service.teacherService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class doItStu {

    private SqlSessionFactory sqlSessionFactory;
    public void SetUp() throws  Exception{
        String resource = "/com/service/SqlConfigMapp.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public void writeInfoExam(student student) throws Exception {
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentService studentService = sqlSession.getMapper(com.service.studentService.class);
        studentService.writeInfoExam(student);
        sqlSession.commit();
    }

    /**
     * 更改密码
     * @throws Exception
     */

    public void update_S(student student) throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
       studentService studentService =sqlSession.getMapper(com.service.studentService.class);
       studentService.update_S(student);
        sqlSession.commit();
        sqlSession.close();
    }
}
