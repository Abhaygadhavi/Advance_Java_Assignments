/*
 * Author: Abhay Gadhvi
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */
package Assignment2;

class MyDateP
{
	
	//private data members
			private int day,month,year;
    
    MyDateP(){
		
		day=6;
		month=6;
		year=2006;
		
		System.out.println("Default Constructor");
		
	}
    MyDateP( int d,int m,int y)
    {
    	day=d;
		month=m;
		year=y;
		
		System.out.println("parametarized Constructor");
        
    }
    public void printDate() {
		System.out.println(day+"/"+month+"/"+year);
	}

   
	
}
public class DateMainP{

    public static void main(String []args){
       MyDateP c= new MyDateP();
       c.printDate();

       
       MyDateP c2= new MyDateP(2,6,2004);
       c2.printDate();
    }
    
    
}