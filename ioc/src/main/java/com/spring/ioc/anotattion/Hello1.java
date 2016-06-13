package com.spring.ioc.anotattion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello1 {

	@Autowired
	//@Qualifier("ao1")
	private A aobj;
	

	@Autowired
	//@Qualifier("bo2")
	private B bobj;
	
	/*
	@Autowired
	
	public Hello1(@Qualifier("ao1") A ao,@Qualifier("bo1") B bo) {
		super();
		this.aobj = ao;
		this.bobj = bo;
	}

*/

	//@Autowired
	public void show() {
		// TODO Auto-generated method stub
		
		//aobj.dispalyA();
		//bobj.dispalyB();
		
		System.out.println(aobj);	
		System.out.println(bobj);	

		
	}

}
