package com.phoenix.vehicles.car;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable {

	@Override
	public void start() {
		System.out.println("\tCar starts");
	}
	
	@Override
	public void stop() {
		System.out.println("\tCar stops");
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\tCar runs");

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("\tCar moves");
	}

}
