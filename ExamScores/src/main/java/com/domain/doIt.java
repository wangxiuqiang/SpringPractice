package com.domain;

import com.service.adminService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.InputStream;
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
}
