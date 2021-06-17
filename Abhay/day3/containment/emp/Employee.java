
/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package containment.emp;

import containment.date.MyDate;

public class Employee {
	
	//private data members
	private int empId;
	private String name;
	private MyDate birthDate;
	
	//default constructor
	public Employee(){
		empId=111;
		name="Abhay";
		birthDate=new MyDate(9,9,1999);
	}
	
	//parameterized constructor
	public Employee(int empId,String name,MyDate birthDate){
		this.empId=empId;
		this.name=name;
		this.birthDate=birthDate;
	}
	
	//setter and getter methods
	public void setEmpId(int e) {
		empId=e;
	}
	public int getEmpId() {
		return empId;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setBirthDate(MyDate bd) {
		birthDate=bd;
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	
	//display method
    public void display() {
		System.out.println("employee ID:"+empId+"\tName:"+name+"\tBirth date:"+birthDate);
	
    }
    
    //toString method
	public String toString() {
		return "employee ID:"+empId+"\tName:"+name+"\tBirth date:"+birthDate;
	
	}

}
