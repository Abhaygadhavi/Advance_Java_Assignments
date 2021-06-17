/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package com.phoenix.shapes.circles;
import com.phoenix.shapes.Shape;


public class Circle extends Shape{

	//private data members
	private float radius;
	
	//default constructor
	public Circle(){
		radius=5.0f;
	}
	
	//parameterized constructor
	public Circle(float radius){
		this.radius=radius;
	}
	
	//method to calculate area
	@Override
	public void calculateArea() {
		System.out.println("Area of circle is:"+(MATH_PI*this.radius*this.radius));
	}
		
	//method to calculate perimeter
	@Override
	public void calculatePerimeter() {
		System.out.println("perimeter of circle is:"+(2*MATH_PI*this.radius));
		
	};
}
