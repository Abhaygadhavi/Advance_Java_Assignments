/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */



package containment.date;

public class MyDate {

	//private data members
	private int day,month,year;
	
	//default constructor
	public MyDate(){
		day=1;
		month=1;
		year=2001;
	}
	
	//parameterized constructor
	public MyDate(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	//setter and getter methods
	public void setDay(int d) {
		day=d;
	}
	public int getDay() {
		return day;
	}
	public void setMonth(int m) {
		month=m;
	}
	public int getMonth() {
		return month;
	}
	public void setYear(int y) {
		year=y;
	}
	public int getYear() {
		return year;
	}
	
	//method to print date
    public void printDate() {
		System.out.println(day+"/"+month+"/"+year);
	
    }
    
    //toString method
	public String toString() {
		return day+"/"+month+"/"+year;
	}
}
