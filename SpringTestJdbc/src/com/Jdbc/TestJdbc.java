package com.Jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbc {
	
    public static void main(String[] args){
    	String sql;
    	sql = "select * from product";
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    	JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
    	List list = (List) jdbcTemplate.queryForList(sql);
    	for(int j = 0; j < list.size(); j ++){
    		System.out.println(list.get(j).toString());
    	}
    }
	
}
