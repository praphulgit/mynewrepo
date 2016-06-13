package com.spring.ioc;

public class B {

	private int a;
	private String str;
	public B(int a, String str) {
		super();
		this.a = a;
		this.str = str;
	}
	@Override
	public String toString() {
		return "B [a=" + a + ", str=" + str + "]";
	}
	
	
	
}
