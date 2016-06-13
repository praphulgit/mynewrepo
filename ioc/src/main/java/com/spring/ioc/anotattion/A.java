package com.spring.ioc.anotattion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("myclassA")
public class A {
 
	
	private int a;
	private String msg;
	
	public void dispalyA(){
		System.out.println("from class A");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "A [a=" + a + ", msg=" + msg + "]";
	}
	
	
}
