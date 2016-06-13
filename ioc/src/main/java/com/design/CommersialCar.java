package com.design;

public class CommersialCar extends CarDecorator{

	
	
	  public CommersialCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	    public void assemble(){
	        car.assemble();
	        System.out.print(" Adding features of Commersial Car.");
	    }
}
