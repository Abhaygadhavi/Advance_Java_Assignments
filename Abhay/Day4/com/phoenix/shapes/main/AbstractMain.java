/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//superclass reference
		Shape s1;
		
		//calling circle with the superclass reference
		System.out.println("\nCircle:");
		s1= new Circle(10.0f);
		s1.calculateArea();
		s1.calculatePerimeter();
		
		//calling rectangle with the superclass reference
		System.out.println("\nRectangle:");
		s1= new Rectangle(10,20);
		s1.calculateArea();               
		s1.calculatePerimeter();	
		
		//calling square with the superclass reference
		System.out.println("\nSquare:");
		s1= new Square(50);
		s1.calculateArea();               
		s1.calculatePerimeter();
	}

}
