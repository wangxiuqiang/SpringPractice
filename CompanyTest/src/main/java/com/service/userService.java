package com.service;

import com.domain.admin;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.*;

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

    public String[] adminJoin(){
        String[] JoinIn = new String[2];
         //String Querysql = "select * from admin";
        //List list =  jdbcTemplate.queryForList(Querysql);
       // if(list.size() > 0 && list.isEmpty()){
        //    return null;
        //}else {
            Iterator<admin> it = list.iterator();
            while (it.hasNext()) {
                admin a = (admin) it.next();
                JoinIn[0] = a.getName();
                JoinIn[1] = a.getPassword();
           }
            return JoinIn;
        //}
    }
}
