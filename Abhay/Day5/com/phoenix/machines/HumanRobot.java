/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */
package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot extends Robot implements Walkable {

	@Override
	public void processData() {
		System.out.println("\tHumanRobot processes the data");
	}
	
	@Override
	public void senseInfo() {
		System.out.println("\tHumanRobot senses the info");
	}
	
	@Override
	public void useArtificialIntelligence() {
		System.out.println("\tHumanRobot uses AI");
	}
	
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("\tHumanRobot jumps");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("\tHumanRobot walks");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("\tHumanRobot moves");
	}
}
