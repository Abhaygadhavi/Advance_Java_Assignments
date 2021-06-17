/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */

package com.phoenix.designpatterns.factory.main;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String charType=args[0];
		
		Car c=CarFactory.newCar(charType);
		c.start();
		c.run();
		c.stop();
		
	}

}
