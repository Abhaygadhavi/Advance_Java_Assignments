/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */

package inheritance.emp.mgr;

import inheritance.emp.Employee;

public class Manager extends Employee {
	
	
	//private data members
		
		private double incentives;
		
		//default constructor
		public Manager(){
			incentives=1000;
		}
		
		
		
		//parameterized constructor
		public Manager(int empId,String name,double salary,double incentives){
			super(empId,name,salary);
			this.incentives=incentives;
		}
		
		//show incentives method
		public void showIncentives() {
			System.out.println("ShowIncentive() Incentives :"+incentives);
		}
		
		//display method
	    public void display() {
	    	super.display();
			System.out.println("display() Incentives:"+incentives);
		
	    }
	    
	    //toString method
		public String toString() {
			return super.toString()+"\ttoString() Incentives:"+incentives;
		
		}


}
