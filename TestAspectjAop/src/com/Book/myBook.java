package com.Book;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by wxq on 17-8-2.
 */
public class myBook {
    public void before (){
        System.out.println("前置增强");
    }

    public void after(){
        System.out.println("后置增强");
    }

    //环绕通知
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("执行方法之前");

        proceedingJoinPoint.proceed();

        System.out.println("执行方法之后");
    }
}
