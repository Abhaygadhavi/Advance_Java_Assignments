/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape {

			//private data members
			private int side;
			
			//default constructor
			public Square(){
				side=10;
			}
			
			//parameterized constructor
			public Square(int side){
				this.side=side;
			}
			
			//method to calculate area
			@Override
			public void calculateArea() {
				System.out.println("Area of square is:"+(this.side*this.side));
			}
				
			//method to calculate perimeter
			@Override
			public void calculatePerimeter() {
				System.out.println("perimeter of square is:"+(4*(this.side)));
				
			};
	
}
