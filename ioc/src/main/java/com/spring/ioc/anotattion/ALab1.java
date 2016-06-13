package com.spring.ioc.anotattion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ALab1 {

	public static void main(String[] args) {
		ApplicationContext cfg=new ClassPathXmlApplicationContext("spring_ioc_annotation.xml");
		
		Hello hello = (Hello)cfg.getBean("hello");
		
		hello.show();
		
	}
}
