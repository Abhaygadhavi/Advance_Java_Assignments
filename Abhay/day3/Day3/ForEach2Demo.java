/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package Day3;

public class ForEach2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring 2d array with new keyword
		
		int [][]a=new int[2][2];
		a[0][0]= 1;
		a[0][1]= 2;
		a[1][0]= 3;
		a[1][1]= 4;
		for(int[] x:a) {
			for(int x2:x) {
				System.out.print(x2+" ");
			}
			System.out.println(" ");
		}
		
		//declaring 2d array with new keyword
		
		System.out.println(" ");
		int a2[][] = {{1,2,3,4},{5,6,7,8}};
		
		for(int[] x3:a2) {
			for(int x4:x3) {
				System.out.print(x4+" ");
			}
			System.out.println(" ");
		}
		
		
		
	}

}