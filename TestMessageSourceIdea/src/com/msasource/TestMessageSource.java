package com.msasource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.ArrayList;
/**
 * Created by wxq on 17-7-30.
 */
public class TestMessageSource  {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        String[] a = {"用户"};
        String hello = ctx.getMessage("hello",a, Locale.getDefault());
        Object[] b = { new Date()};
        String now = ctx.getMessage("now",b,Locale.getDefault());
        System.out.println("\n本地化信息");
        System.out.println(hello);
        System.out.println(now);

        hello = ctx.getMessage("hello",a,Locale.US);
        now = ctx.getMessage("now",b,Locale.US);
        System.out.println("\nEnglish message");
        System.out.println(hello);
        System.out.println(now);

        hello = ctx.getMessage("hello",a,Locale.CHINA);
        now = ctx.getMessage("now",b,Locale.CHINA);
        System.out.println("\n中文信息");
        System.out.println(hello);
        System.out.println(now);

    }
}
