package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class LabIOC {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_ioc.xml");
		
		Customer cust = (Customer) ctx.getBean("cust");
		System.out.println("====================================");
		cust.show();
		System.out.println("====================================");
	}
}
