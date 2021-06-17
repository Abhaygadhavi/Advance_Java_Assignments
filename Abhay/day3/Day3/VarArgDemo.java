/*
 * Author: Abhay Gadhvi
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */

//VarArg demo
package Day3;

public class VarArgDemo {
	
	public static double average(int...v) {
		
		double total=0;
		
		//for each loop to calculate total
		for(int ele:v)
			total+=ele;
		double average=total/v.length;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling the average method
		double x=average(5,7,8);
		System.out.println("average value is:"+x);
		
	}

}
