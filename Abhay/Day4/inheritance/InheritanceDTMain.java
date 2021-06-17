/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */



package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//object of manager class using parameterized constructor
		//
		System.out.println("*****\t Manager using parameterized constructor \t*****\n");
		Employee obb;//using super class reference
		obb=new Manager(1255,"Nana patekar",500,50);
		((Manager)obb).display();
		((Manager)obb).showIncentives();
		System.out.println(" ");
		
		//
		//object of WageEmp class using parameterized constructor
		//
		System.out.println("*****\t WageEmp using parameterized constructor \t*****\n");
		obb= new WageEmp(333,"omni king",100,100.0f);
		((WageEmp)obb).display();
		((WageEmp)obb).calculateWage();

	}

}
