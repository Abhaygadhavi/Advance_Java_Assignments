/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package Day3;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring 1d array with new keyword
		int []a;
		a=new int[2];
		a[0]=1;
		a[1]=2;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		//1d array of int without new keyword
		System.out.println(" ");
		int a2[] = {1,2,3};
		for(int i=0;i<a2.length;i++) {
			System.out.print(a2[i]);
		}
		
		//1d array of string type for city names
		System.out.println(" ");
		String a3[] = {"Ahmedabad","Vadodara","Surat"};
		for(int i=0;i<a3.length;i++) {
			System.out.print(a3[i]+" ");
		}
		
		//1d array of string type for hoby names
		System.out.println(" ");
		String a4[] = {"reading","travelling","exercise"};
		for(int i=0;i<a4.length;i++) {
			System.out.print(a4[i]+" ");
		}
		
	}

}
