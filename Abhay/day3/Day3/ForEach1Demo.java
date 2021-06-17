/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package Day3;

public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring 1d array with new keyword
		double []a;
		a=new double[2];
		a[0]=1.0;
		a[1]=2.0;
		for(double x:a) {
			System.out.print(x+" ");
		}
		//1d array of int without new keyword
		System.out.println(" ");
		float a2[] = {1,2,3};
		for(float x2:a2) {
			System.out.print(x2+" ");
		}
		
		//1d array of string type for city names
		System.out.println(" ");
		String a3[] = {"rose","lotus","jasmine"};
		for(String x3:a3) {
			System.out.print(x3+" ");
		}
		
		//1d array of string type for hoby names
		System.out.println(" ");
		String a4[] = {"INDIA","usa","canada"};
		for(String x4:a4) {
			System.out.print(x4+" ");
		}
		
	}

}