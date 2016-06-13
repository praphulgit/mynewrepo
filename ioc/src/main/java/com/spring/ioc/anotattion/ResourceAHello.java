package com.spring.ioc.anotattion;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class ResourceAHello {
	
	
	// autowiring by type
	//@Resource
	/*@Resource(name="ao1")
	private ResourceA aobj;
	*/
	
	//@Resource(name="ao1")
	@Autowired
	@Qualifier("ao")
	private ResourceA aobj;
	
	
	
	// autowiring by Name
	@Resource(name="bo2")
	private ResourceB bobj;
	
	public void show() {
		// TODO Auto-generated method stub
      System.out.println(aobj);
      System.out.println(bobj);
	}
	
	

}
