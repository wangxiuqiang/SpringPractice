package com.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
             AbstractLookupBean bean = (AbstractLookupBean) ctx.getBean("abstractLookupBean");
             HelperBean bean1 = bean.getHelperBean();
             HelperBean bean2 = bean.getHelperBean();
             System.out.println((bean1 == bean2));
	}

}
