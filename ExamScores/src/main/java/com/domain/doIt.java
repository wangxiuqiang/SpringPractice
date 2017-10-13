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
     * 用来查询单个的学生信息
     */
    public student queryOneStudent(key key) throws Exception{
         List<student> list = queryAllStudent();
        int i;
        for(i = 0; i < list.size(); i ++ ) {
            if(key.getId() == list.get(i).getId()) {
                break;
            }
        }
        return list.get(i);
    }
    /**
     * 用来查询单个的老师信息
     */
    public teacher queryOneTeacher(key key) throws Exception{
        List<teacher> list = queryAllTeacher();
        int i;
        for(i = 0; i < list.size(); i ++ ) {
            if(key.getId() == list.get(i).getId()) {
                break;
            }
        }
        return list.get(i);
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

    /**
     * 录入老师的信息
     */
    public void insertT(teacher teacher) throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        adminService adminService = sqlSession.getMapper(com.service.adminService.class);
        adminService.insertT(teacher);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 录入学生信息
     * @param student
     * @throws Exception
     */
    public void insertS(student student) throws Exception {
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        adminService adminService = sqlSession.getMapper(com.service.adminService.class);
        adminService.insertS(student);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 删除信息,根据flag  1老师 0 学生
     *
     */
    public void delete_TS( int flag ,int id) throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        adminService adminService = sqlSession.getMapper(com.service.adminService.class);
        if(flag == 1)
        {
            adminService.delete_T(id);
        }else{
            adminService.delete_S(id);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
