/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */



package inheritance.emp.mgr;


import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData {
	
	public Manager getEmployee() {
		return new Manager();
	}

}
