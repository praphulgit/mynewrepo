package com.spring.ioc.anotattion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("myclassB")
public class B {
  
	private int b;
	private String str;
	
	public void dispalyB(){
		System.out.println("from class B");
	}
	public B()
	{}
	public B(int b, String str) {
		
		this.b = b;
		this.str = str;
	}
	@Override
	public String toString() {
		return "B [b=" + b + ", str=" + str + "]";
	}
	
	
}
