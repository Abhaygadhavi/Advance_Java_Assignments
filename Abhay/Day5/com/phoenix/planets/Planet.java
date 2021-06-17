/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */
package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable {

	//private data members
	private int noOfMoons;
	
	//getter and setter methods
	public void setNoOfMoons(int n) {
		noOfMoons=n;
	}
	public int getNoOfMoons() {
		return noOfMoons;
	}
	
	//protected abstract method
	protected abstract boolean supportsLife();
	
	//toString method
	@Override
	public String toString() {
		return "\tNo of moons are:"+noOfMoons;
	}
	
	@Override
	public void revolve() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
