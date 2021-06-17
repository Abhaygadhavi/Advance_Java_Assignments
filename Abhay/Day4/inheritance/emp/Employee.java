/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package inheritance.emp;



public class Employee {
	
	//private data members
		private int empId;
		private String name;
		private double salary;
		
		//default constructor
		public Employee(){
			empId=111;
			name="Abhay";
			salary=40000.00;
		}
		
		//parameterized constructor
		public Employee(int empId,String name) {
			this.empId=empId;
			this.name=name;
		}
		
		//parameterized constructor
		public Employee(int empId,String name,double salary){
			this.empId=empId;
			this.name=name;
			this.salary=salary;
		}
		
		//display method
	    protected void display() {
			System.out.println("display() employee ID:"+empId+"\tName:"+name+"\tSalary:"+salary);
		
	    }
	    
	    //toString method
		public String toString() {
			return "toString() employee ID:"+empId+"\tName:"+name+"\tSalary:"+salary;
		
		}

}
