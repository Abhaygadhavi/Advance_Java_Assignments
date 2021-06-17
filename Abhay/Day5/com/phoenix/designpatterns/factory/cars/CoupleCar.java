package com.phoenix.designpatterns.factory.cars;

public class CoupleCar extends Car {

	public CoupleCar() {
		
		System.out.println("\t CoupleCar is created");
	}
	
	@Override
	public void start() {
		System.out.println("\t CoupleCar starts");
	}
	
	@Override
	public void stop() {
		System.out.println("\t CoupleCar stops");
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\t CoupleCar runs");

	}
}
