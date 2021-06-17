/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */
package com.phoenix.machines;

import com.phoenix.interfaces.Movable;

public class Robot implements Movable {

	
	void processData() {
		System.out.println("\tRobot processes the data");
	}
	
	void senseInfo() {
		System.out.println("\tRobot senses the info");
	}
	
	void useArtificialIntelligence() {
		System.out.println("\tRobot uses AI");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("\tRobot moves");
	}

}
