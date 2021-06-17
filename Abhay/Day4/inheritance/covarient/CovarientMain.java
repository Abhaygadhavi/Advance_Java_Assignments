/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package inheritance.covarient;

import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovarientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nEmployeeData:");
		EmployeeData e1= new EmployeeData();
		Employee emp1= e1.getEmployee();
		System.out.println(emp1);
		
		System.out.println("\nManagerData:");
		ManagerData m1= new ManagerData();
		Manager mg1= m1.getEmployee();
		System.out.println(mg1);
		
		System.out.println("\nWageEmpData:");
		WageEmpData w1= new WageEmpData();
		WageEmp wg1= w1.getEmployee();
		System.out.println(wg1);
		wg1.calculateWage();
		
		
		
	}

}
