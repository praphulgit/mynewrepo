package com.spring.ioc.anotattion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A1Lab {
	public static void main(String[] args) {
		ApplicationContext cfg=new ClassPathXmlApplicationContext("spring_ioc_annotation1.xml");
		
		Hello1 hello = (Hello1)cfg.getBean("hello1");
		
		hello.show();
		
	}
}
