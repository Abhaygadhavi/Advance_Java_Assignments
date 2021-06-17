/*
 * Author: Abhay Gadhvi
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */
package Assignment2;

class MyDateT
{
	
	//private data members
	private int day,month,year;
    
    MyDateT(){
    	this(5,5,2005);
		day=6;
		month=6;
		year=2006;
		
		System.out.println("Default Constructor");
		
	}
    MyDateT( int d,int m,int y)
    {
    	this.day=d;
		this.month=m;
		this.year=y;
		
		System.out.println("parametarized Constructor");
        
    }
    public void printDate() {
		System.out.println(day+"/"+month+"/"+year);
	}

   
	
}
public class DateMainT{

    public static void main(String []args){
       MyDateT c= new MyDateT();
       c.printDate();

       
       MyDateT c2= new MyDateT(2,6,2004);
       c2.printDate();
    }
    
    
}