package com.BeanNameAware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wxq on 17-7-30.
 */
public class beanNameAwareTest implements InitializingBean ,BeanNameAware {

    private String beanName;
    private String name;
    private int age = 0;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(this.age);
    }

    public static void main(String[] args){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
       for (int j = 1; j <= 3; j ++){
           ctx.getBean("bean" + j);
       }
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
        System.out.println(  "回调setBeanName方法,BeanName " + beanName);
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println(beanName +"初始化,调用afterPropertiesSet 方法");

    }
}
