package com.service;

import com.domain.Join;
import com.domain.student;
import com.domain.teacher;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * 用来写那个数据库的操作
 */

public class adminService  {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public int  addInformation(){
        return 1;
    }
    public int deleteInformation(){
        return 1;
    }
    public int updateInformation(){
        return 1;
    }
    /*
      用户登录的信息验证
     */
    public Join adminJoin() {

        String Querysql = "select * from admin";
        try {
            Join admin = jdbcTemplate.queryForObject(Querysql,new MyRowMapper());

            if (admin != null) {
                return admin;
            } else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 添加员工的jdbc操作
     */

        public List queryInformation(int id) {
        String querySql ;
        List<teacher> list =new ArrayList<teacher>();
            teacher teacher;
        int  i = 1;
        switch(id){
            case 1: querySql = "select * from teacher WHERE id = ";
                teacher = jdbcTemplate.queryForObject(querySql,new MyRowMapper1());
                   while (teacher != null) {
                        list.add(teacher);
                       teacher = jdbcTemplate.queryForObject(querySql,new MyRowMapper1());
                   }
                     break;
            case 2:querySql = "select * from student";
            default: list = null;
        }
        return list;
    }

}
class MyRowMapper implements RowMapper<Join> {
    public Join mapRow(ResultSet rs, int n) throws SQLException {
        String name= rs.getString("name");
        String password = rs.getString("password");
        Join  admin = new Join();
        admin.setName(name);
        admin.setPassword(password);
        return admin;
    }
}

class MyRowMapper1 implements RowMapper<teacher> {
    public teacher mapRow(ResultSet rs, int n) throws SQLException {
        int id = rs.getInt("id");
        String name= rs.getString("name");
        String password = rs.getString("password");
        teacher teacher = new teacher();
        teacher.setTid(id);
        teacher.setTname(name);
        teacher.setTpassword(password);
        return  teacher;
    }
}



