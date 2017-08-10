package com.service;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    public Map<String ,String > adminJoin(){
        Map<String ,String> map = new HashMap<String, String>() ;

        return map;
    }
}
