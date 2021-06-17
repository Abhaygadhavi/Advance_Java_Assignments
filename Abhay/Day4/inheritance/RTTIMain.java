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

public class RTTIMain {
	
	public static void showEmpInfo(Employee e1) {
		
		if(e1 instanceof Manager) {
			System.out.println("Manager: ");
			((Manager)e1).display();
		}
		else if(e1 instanceof WageEmp) {
			System.out.println("WageEmp: ");
			((WageEmp)e1).display();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1 = new Manager(1,"abcd",10000,1000);
		showEmpInfo(m1);
		
		WageEmp w1 = new WageEmp(2,"Abhay",500,200);
		showEmpInfo(w1);

	}

}
