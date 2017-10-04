package com.domain;

import com.service.adminService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class doIt {
    private SqlSessionFactory sqlSessionFactory;
    public void SetUp() throws  Exception{
        String resource = "/com/service/SqlConfigMapp.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
/*
   管理员登录的函数,获取管理员信息
 */
    public Join adminJoinInIt() throws Exception {
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        adminService adminService = sqlSession.getMapper(com.service.adminService.class);
        Join join = adminService.adminJoinIn();
        sqlSession.close();
        return join;
    }
    /**
     * 用来返回老师的全部信息的方法
     */
    public List<teacher>  queryAllTeacher() throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        adminService adminService = sqlSession.getMapper(com.service.adminService.class);
        List<teacher> teachers = adminService.queryAllForTeacher();
        return teachers;
    }
}
