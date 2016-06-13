package com.spring.ioc.anotattion;

public class B1 {
	private int b;
	private String str;
	public B1(int b, String str) {
		this.b = b;
		this.str = str;
	}
	@Override
	public String toString() {
		return "B1 [b=" + b + ", str=" + str + "]";
	}
	
}
