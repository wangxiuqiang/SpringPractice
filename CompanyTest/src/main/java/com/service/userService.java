package com.service;

import org.springframework.jdbc.core.JdbcTemplate;

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
}
