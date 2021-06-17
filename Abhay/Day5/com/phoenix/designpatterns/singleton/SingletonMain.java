/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package com.phoenix.designpatterns.singleton;

class Sun{
	
	private static Sun ob;
	
	private Sun() {
		System.out.println("Sun object created");
	}
	
	public static Sun newInstance() {
		
		if(ob==null)
			ob=new Sun();
		return ob;
	}
	public void giveLight() {
		
		System.out.println("Sun gives light");
	}
	
}

class Earth{
	
	private static Earth ob;
	
	private Earth() {
		System.out.println("Earth object created");
	}
	
	public static Earth newInstance() {
		
		if(ob==null)
			ob=new Earth();
		return ob;
	}	
	public void createLife() {
		System.out.println("Earth creates life");
	}
	
}

class PrimeMinister{
	
	private static PrimeMinister ob;
	
	private PrimeMinister() {
		System.out.println("PrimneMinister created");
	}
	
	public static PrimeMinister newInstance() {
		
		if(ob==null)
			ob=new PrimeMinister();
		return ob;
	}
	public void serveNation() {
		System.out.println("PrimneMinister serves the nation");
	}
	
}

class President{
	
	private static President ob;
	
	private President() {
		System.out.println("President created");
	}
	
	public static President newInstance() {
		if(ob==null)
			ob=new President();
		return ob;
	}
	
	public void representNation() {
		System.out.println("President represents nation");
	}
	
}

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sun s1=Sun.newInstance();
		s1.giveLight();
		Earth e1=Earth.newInstance();
		e1.createLife();;
		PrimeMinister pm=PrimeMinister.newInstance();
		pm.serveNation();
		President ps=President.newInstance();
		ps.representNation();
		
		
	}
	
}
