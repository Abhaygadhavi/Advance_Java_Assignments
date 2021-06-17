/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.planets.Planet;
import com.phoenix.vehicles.car.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reference of movable interface
		Movable m1=null;
		
		//
		//object of earth class
		System.out.println("\n\t***Earth*** ");
		m1=new Earth();
		((Planet)m1).setNoOfMoons(1);
		System.out.println(m1);
		if(((Earth)m1).supportsLife())
			System.out.println("\tEarth Supports life");
		else
			System.out.println("\tDoesn't support life");
		((Earth)m1).revolve();
		((Earth)m1).rotate();
		m1.move();
		
		//
		//object of jupiter class
		System.out.println("\n\t***jupiter*** ");
		m1=new Jupiter();
		((Planet)m1).setNoOfMoons(79);
		System.out.println(m1);
		if(((Jupiter)m1).supportsLife())
			System.out.println("\tSupports life");
		else
			System.out.println("\tDoesn't support life");
		((Jupiter)m1).revolve();
		((Jupiter)m1).rotate();
		m1.move();
		
		//
		//object of tiger class
		System.out.println("\n\t***Tiger*** ");
		m1=new Tiger();
		((Tiger)m1).jump();
		((Tiger)m1).walk();
		m1.move();
		
		//
		//object of cat class
		System.out.println("\n\t***Cat*** ");
		m1=new Cat();
		((Cat)m1).jump();
		((Cat)m1).walk();
		m1.move();
		
		//
		//object of car class
		System.out.println("\n\t***Car*** ");
		m1=new Car();
		((Car)m1).start();
		((Car)m1).stop();
		((Car)m1).run();
		m1.move();
		
		//
		//object of HumanRobot class
		System.out.println("\n\t***HumanRobot*** ");
		m1=new HumanRobot();
		((HumanRobot)m1).jump();
		((HumanRobot)m1).walk();
		((HumanRobot)m1).processData();
		((HumanRobot)m1).senseInfo();
		((HumanRobot)m1).useArtificialIntelligence();
		m1.move();

	}

}
