package com.spring.ioc.anotattion;

public class ResourceB {
   
	  private int b;
	  private String str;
	public ResourceB(int b, String str) {
		super();
		this.b = b;
		this.str = str;
	}
	@Override
	public String toString() {
		return "ResourceB [b=" + b + ", str=" + str + "]";
	}
	  
	  
}
