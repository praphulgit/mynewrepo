package com.spring.ioc.anotattion;

public class A1 {
	private int a;
	private String msg;
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
		return "A1 [a=" + a + ", msg=" + msg + "]";
	}
	
}
