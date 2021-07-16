package com.phoenix.interfaces.functional;

/*
 * @author : abhay.gadhvi@sttech.in
 * @copyright: STL
 * 
 */

public class LambdaExpressionDemo {

	public void doMath(Addable ob) {
		System.out.println(ob.add(10, 20));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movable m=()->System.out.println("Annonymous object moves");
		m.move();
		
		Jumpable j=()->System.out.println("Annonymous object jumps");
		j.jump();
		
		Addable ob=(x,y)->x+y;
		System.out.println("addition is: "+ob.add(10,20));
	
		//calling default method
		float res1=ob.addFloats(2.3f, 6.4f);
		System.out.println("addition of float is: "+res1);

		//invoking static method
		Addable.show();
		
		Greeting g= a ->"hello "+ a;
		System.out.println("addition is: "+g.greet("Abhay"));

		LambdaExpressionDemo ref= new LambdaExpressionDemo();
		ref.doMath((c,d)->c+d);
	
		
	}

}
