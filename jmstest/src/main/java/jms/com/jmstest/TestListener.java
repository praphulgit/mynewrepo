package jms.com.jmstest;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestListener {
	
	public static void main(String[] args) {
	    GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("/jms_activemq.xml");  
	  //  ctx.load("classpath:applicationContext.xml");  
	   // ctx.refresh();  
	  //  System.out.println(ctx);
	  //    System.out.println("TestListener");
	      
	   //  ctx.refresh();  
	      
	      while(true){}
	}
}
