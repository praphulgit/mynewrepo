package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByConstructor {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("auto_by_constructor.xml");
		// autowore by name
		HelloAutoConstructor hello=(HelloAutoConstructor)ctx.getBean("hello");
		hello.show();

	}
}
