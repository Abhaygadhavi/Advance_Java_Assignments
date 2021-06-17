/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package Day3;

public class MyDate {

	int day,month,year;
	public MyDate(){
		day=1;
		month=1;
		year=2001;
	}
	
	public MyDate(int d,int m,int y){
		this.day=d;
		this.month=m;
		this.year=y;
	}
	
	public String toString() {
		return day+"/"+month+"/"+year;
	}
}
