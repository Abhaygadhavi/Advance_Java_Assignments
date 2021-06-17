package com.phoenix.designpatterns.factory.cars;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		
		System.out.println("\t LuxuryCar is created");
	}
	
	@Override
	public void start() {
		System.out.println("\t LuxuryCar starts");
	}
	
	@Override
	public void stop() {
		System.out.println("\t LuxuryCar stops");
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\t LuxuryCar runs");

	}
}
