package com.service;

import com.domain.Join;
import com.domain.student;
import com.domain.teacher;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * 用来写那个数据库的操作
 */
@Service
public class adminService  implements adminServiceImp{
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

        public List queryInformation() {
        String querySql ;
        List list;
        switch(1){
            case 1: querySql = "select * from teacher";
                   list = jdbcTemplate.queryForList(querySql);break;
            case 2:querySql = "select * from student";
                   list = jdbcTemplate.queryForList(querySql);break;

            default: list = null;
        }
        return list;
    }

}


class MyRowMapper implements RowMapper<Join> {
     public Join mapRow(ResultSet rs, int n) throws SQLException {
         String name=	rs.getString("name");
         String password = rs.getString("password");
         int id = rs.getInt("id");

         Join  admin = new Join();
         admin.setName(name);
         admin.setPassword(password);
         admin.setId(id);
         return admin;
     }
}
