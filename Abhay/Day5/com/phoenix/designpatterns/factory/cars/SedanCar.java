package com.phoenix.designpatterns.factory.cars;

public class SedanCar extends Car {

		public SedanCar() {
		
			System.out.println("\t SedanCar is created");
		}
		
		@Override
		public void start() {
			System.out.println("\t SedanCar starts");
		}
		
		@Override
		public void stop() {
			System.out.println("\t SedanCar stops");
		}
		
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("\t SedanCar runs");

		}
	
}
