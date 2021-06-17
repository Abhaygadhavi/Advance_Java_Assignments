package com.phoenix.vehicles;

public abstract class Vehicle {

	protected void start() {
		System.out.println("\tVehicle starts");
	}
	
	protected void stop() {
		System.out.println("\tVehicle stops");
	}
}
