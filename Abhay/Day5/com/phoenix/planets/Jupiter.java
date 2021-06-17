package com.phoenix.planets;

public class Jupiter extends Planet {

	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("\tJupiter revolves");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("\tJupiter rotates");

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("\tJupiter moves");

	}

}
