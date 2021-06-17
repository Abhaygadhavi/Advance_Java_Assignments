/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */

package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

public class CarFactory {

	//Factory Method
	public static Car newCar(String carType) {
		if(carType.equals("Sedan"))
			return new SedanCar();
		
		else if(carType.equals("Couple"))
			return new CoupleCar();
		
		else if(carType.equals("Sport"))
			return new SportCar();
		
		else if(carType.equals("Luxury"))
			return new LuxuryCar();
		
		else
			return null;
	}
}
