package com.design;

public class DecoratorPatternTest {
	
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");
         
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
        System.out.println("\n*****");
        Car CommersialLuxuryCar = new CommersialCar(new LuxuryCar(new BasicCar()));
        CommersialLuxuryCar.assemble();
        
    }

}