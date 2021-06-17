/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package inheritance.emp;

public class WageEmp extends Employee{
	
			//private data members
			private int noOfHours;
			private float ratePerHour;
			
			public float wage;
			//default constructor
			public WageEmp(){
				noOfHours=3;
				ratePerHour=400.00f;
			}
			
			//parameterized constructor
			public WageEmp(int empId,String name,int noOfHours,float ratePerHour) {
				super(empId,name);
				this.noOfHours=noOfHours;
				this.ratePerHour=ratePerHour;
			}
			
			//calculateWage method
			public void calculateWage() {
				
				wage= noOfHours*ratePerHour;
				System.out.println("Wage is:"+wage);
			}
			
			//display method
		    public void display() {
		    	super.display();
				System.out.println("WageEmp_display() No. of Hours:"+noOfHours+"\tRate per Hour:"+ratePerHour);
			
		    }
		    
		    //toString method
			public String toString() {
				return super.toString()+"\tWageEmp_toString()  No. of Hours:"+noOfHours+"\tRate per Hour:"+ratePerHour;
			
			}	

}
