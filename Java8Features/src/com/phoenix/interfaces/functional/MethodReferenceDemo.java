package com.phoenix.interfaces.functional;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static method reference
		Movable m= MyClass::aMethod;
		m.move();
		
		//instance method on specific object
		YourClass ob= new YourClass();
		m=ob::yourMethod;
		m.move();
		
		//instance method reference on arbitrary object
		StringMerger sm=String::concat;
		System.out.println(sm.merge("hello ", "world"));
	
		//constructor reference demo
		Messaging ob1= Message::new;
		Message msg=ob1.getObject("Hello");
		System.out.println(msg.getMsg());

	}

}
