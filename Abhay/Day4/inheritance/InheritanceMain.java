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

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//object of employee using parameterized constructor
		//
		System.out.println("*****\t Employee using parameterized constructor \t*****\n");
		Employee e1= new Employee(123,"Super man",10000);
		//e1.display();
		System.out.println(e1);
		//
		//object of manager using default constructor
		//
		System.out.println("*****\t manager using default constructor \t*****\n");
		Manager m1= new Manager();
		m1.showIncentives();
		m1.display();
		System.out.println(m1);
		//
		//object of manager using parameterized constructor
		//
		System.out.println("*****\t manager using parameterized constructor \t*****\n");
		Manager m2= new Manager(1156,"noone",50000,5000);
		m2.showIncentives();
		m2.display();
		System.out.println(m2);
		//
		//object of WageEmp using default constructor
		//
		System.out.println("*****\t WageEmp using default constructor \t*****\n");
		WageEmp w1= new WageEmp();
		w1.calculateWage();
		w1.display();
		System.out.println(w1);
		//
		//object of WageEmp using parameterized constructor
		//
		System.out.println("*****\t WageEmp using parameterized constructor \t*****\n");
		WageEmp w2= new WageEmp(757,"Dr.Manhatten",100,1000.0f);
		w2.display();
		System.out.println(w2);
		
		
		
		

	}

}
