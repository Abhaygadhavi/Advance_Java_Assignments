/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape{
	//private data members
		private int length;
		private int breadth;
		
		//default constructor
		public Rectangle(){
			length=10;
			breadth=5;
		}
		
		//parameterized constructor
		public Rectangle(int length,int breadth){
			this.length=length;
			this.breadth=breadth;
		}
		
		//method to calculate area
		@Override
		public void calculateArea() {
			System.out.println("Area of rectangle is:"+(this.length*this.breadth));
		}
			
		//method to calculate perimeter
		@Override
		public void calculatePerimeter() {
			System.out.println("perimeter of rectangle is:"+(2*(this.length*this.breadth)));
			
		};

}
