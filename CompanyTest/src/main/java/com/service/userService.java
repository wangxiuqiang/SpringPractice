package com.service;

import com.domain.admin;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 用来写那个数据库的操作
 */
public class userService {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public admin adminJoin() {

        String Querysql = "select * from admin";
        try {
            admin admin = jdbcTemplate.queryForObject(Querysql,new MyRowMapper());

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
}
class MyRowMapper implements RowMapper<admin> {
     public admin mapRow(ResultSet rs, int n) throws SQLException {
         String name =	rs.getString("name");
         String password = rs.getString("password");

         admin admin = new admin();
         admin.setName(name);
         admin.setPassword(password);
         return admin;
     }
}