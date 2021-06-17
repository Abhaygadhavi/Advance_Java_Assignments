package com.phoenix.designpatterns.factory.cars;

public class SportCar extends Car {

	public SportCar() {
		
		System.out.println("\t SportCar is created");
	}
	
	@Override
	public void start() {
		System.out.println("\t SportCar starts");
	}
	
	@Override
	public void stop() {
		System.out.println("\t SportCar stops");
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\t SportCar runs");

	}	
}
