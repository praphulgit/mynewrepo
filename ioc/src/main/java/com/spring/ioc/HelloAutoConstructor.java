package com.spring.ioc;

public class HelloAutoConstructor {

	
	private A aobj;
	private B bobj;
	
	public HelloAutoConstructor() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloAutoConstructor -default");
	}
	
/*	public HelloAutoConstructor(A aobj){
		System.out.println("HelloAutoConstructor -A aobj");
		this.aobj=aobj;
	}
	
	public HelloAutoConstructor(B bobj){
		System.out.println("HelloAutoConstructor -Baobj");
		this.bobj=bobj;
	}
	
	public HelloAutoConstructor(A aobj,B bobj){
		System.out.println("HelloAutoConstructor -A B aobj");
		this.aobj=aobj;
		this.bobj=bobj;
	}
	
		
*/	public void show(){
		System.out.println("aobj "+aobj);
		System.out.println("bobj "+bobj);
	}
}
