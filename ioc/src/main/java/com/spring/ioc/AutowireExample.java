package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireExample {
	
	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring_ioc_autowire.xml");
		// autowore by name
		Hello hello=(Hello)ctx.getBean("hello");
		hello.show();
	}

}
