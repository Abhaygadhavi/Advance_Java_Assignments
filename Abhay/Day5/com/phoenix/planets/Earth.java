/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */

package com.phoenix.planets;

public class Earth extends Planet {

	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("\tEarth revolves");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("\tEarth rotates");

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("\tEarth moves");

	}

}
