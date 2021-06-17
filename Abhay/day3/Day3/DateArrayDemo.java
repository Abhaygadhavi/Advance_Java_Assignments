
/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package Day3;

public class DateArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyDate object using the new keyword
		MyDate[] a=new MyDate[2];
		a[0]= new MyDate(2,2,2002);
		a[1]= new MyDate(3,3,2003);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		//MyDate object without new keyword and in for each loop
		System.out.println(" ");
		MyDate a2[] = {new MyDate(5,5,2005),new MyDate(6,6,2006)};
		for(MyDate x:a2) {
			System.out.print(x+" ");
		}

	}

}
