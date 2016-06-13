package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByType {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring_ioc_autowirebtType.xml");
		// autowore by name
		Hello hello=(Hello)ctx.getBean("hello");
		hello.show();

	}
}
