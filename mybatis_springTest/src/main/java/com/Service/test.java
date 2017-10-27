package com.Service;

import com.domain.movies;
import com.mapper.query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public movies doIt(int id) throws  Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/WEB-INF/springmvc-config.xml");
        query query = (query) applicationContext.getBean("query");
        movies movies = query.queryInfo(id);
        return movies;
    }
}
