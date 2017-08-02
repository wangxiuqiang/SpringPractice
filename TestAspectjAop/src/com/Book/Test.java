package com.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wxq on 17-8-2.
 */
public class Test {

    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Book book = (Book) ctx.getBean("book");
        book.add();
    }

}
