package jms.com.jmstest;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestJmsSender {

	public static void main(String[] args) {  
	    GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("/jms_activemq.xml");  
	//	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
	//    ctx.load("classpath:applicationContext.xml");  
	//    ctx.refresh();  
	      
	    MyMessageSender sender=(MyMessageSender)ctx.getBean("myMessageSender");
	    
	    System.out.println(sender);
	    
	    System.out.println("from sender");
	    
	    sender.sendMessage("hello jms3yuuuu");  
	      
	}  
}
