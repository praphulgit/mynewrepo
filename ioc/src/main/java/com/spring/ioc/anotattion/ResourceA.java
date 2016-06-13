package com.spring.ioc.anotattion;

public class ResourceA {
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
	return "ResourceA [a=" + a + ", msg=" + msg + "]";
}
  
  
}
