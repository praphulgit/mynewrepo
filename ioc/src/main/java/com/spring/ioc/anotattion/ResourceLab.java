package com.spring.ioc.anotattion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceLab {
public static void main(String[] args) {
	
	ApplicationContext cfx=new ClassPathXmlApplicationContext("spring_ioc_annotationR.xml");
	
	ResourceAHello rhello=(ResourceAHello) cfx.getBean("reshello");
	rhello.show();
}
}
