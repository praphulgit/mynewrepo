package com.spring.ioc.anotattion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;

public class Hello {
	
//	@Qualifier("myclassA")
//	@Resource
    @Autowired
	private A aobj;
    
//	@Qualifier("myclassB")
	@Autowired
	//@Resource
	private B bobj;
	
	public void show() {
		// TODO Auto-generated method stub
		
		aobj.dispalyA();
		bobj.dispalyB();
		
	//	System.out.println(aobj);	
	//	System.out.println(bobj);	

		
	}

}
