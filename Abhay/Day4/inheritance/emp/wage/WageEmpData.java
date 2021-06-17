/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */



package inheritance.emp.wage;

import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;


public class WageEmpData extends EmployeeData {

	public WageEmp getEmployee() {
		return new WageEmp();
	}
}
