/*
 * Author: Abhay Gadhvi
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package Assignment2;

class MyDateSG
{
	
	//private data members
	private int day,month,year;
    
	
	MyDateSG(){
		
		day=6;
		month=6;
		year=2006;
		
		System.out.println("Default Constructor");
		
	}
	MyDateSG( int d,int m,int y)
    {
    	this.day=d;
		this.month=m;
		this.year=y;
		
		System.out.println("parametarized Constructor");
        
    }
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
	
    public void printDate() {
		System.out.println(day+"/"+month+"/"+year);
	}

   
	
}
public class DateMainSG{

    public static void main(String []args){
    	MyDateSG c= new MyDateSG();
    	c.setDay(2);
    	c.setMonth(2);
    	c.setYear(2002);
        System.out.println("date is :"+c.getDay()+"/"+c.getMonth()+"/"+c.getYear());

       
        MyDateSG c2= new MyDateSG(2,6,2004);
        System.out.println("date is :"+c2.getDay()+"/"+c2.getMonth()+"/"+c2.getYear());
        //c2.printDate();
    }
    
    
}