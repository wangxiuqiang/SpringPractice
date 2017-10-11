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
        sqlSession.close();
        return teachers;
    }
    /**
     * 用来返回学生的全部信息的方法
     */
    public List<student>  queryAllStudent() throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        adminService adminService = sqlSession.getMapper(com.service.adminService.class);
        List<student> students = adminService.queryAllForStudent();
        sqlSession.close();
        return students;
    }

    /**
     * 用来取出老师的登录信息
     * @return
     * @throws Exception
     */
    public boolean joinMessageTeacher(JoinTS joinTS) throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        adminService adminService = sqlSession.getMapper(com.service.adminService.class);
        List<JoinTS> tList = adminService.joinMessageTeacher();
        sqlSession.close();
        for(int i = 0; i < tList.size(); i ++){
            if(tList.get(i).getId() == joinTS.getId() && tList.get(i).getPassword().equals(joinTS.getPassword())){
                return true;
            }
        }
        return false;
    }
    /**
     * 用来取出学生的登录信息
     * @return
     * @throws Exception
     */
    public boolean  joinMessageStudent(JoinTS joinTS) throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        adminService adminService = sqlSession.getMapper(com.service.adminService.class);
        List<JoinTS> sList = adminService.joinMessageStudent();
        sqlSession.close();
        for(int i = 0; i < sList.size(); i ++){
            if(sList.get(i).getId() == joinTS.getId() && sList.get(i).getPassword().equals(joinTS.getPassword())){
                return true;
            }
        }
        return false;
    }
}
