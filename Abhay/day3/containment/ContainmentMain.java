/*
 * Author: abhay.gadhvi@stltech.in
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */

//containment main 
package containment;


//importing proper classes
import containment.date.MyDate;
import containment.emp.Employee;

public class ContainmentMain {

	public static void main(String[] args) {
		//
		//creating the object of employee type
		//
		
		Employee e1= new Employee();
		
		//invoking the setter methods
		e1.setEmpId(567);
		e1.setName("Batman");
		e1.setBirthDate(new MyDate(4,6,1456));
		
		//invoking the getter methods
		System.out.println("employee ID:"+e1.getEmpId()+"\tName:"+e1.getName()+"\tBirth date:"+e1.getBirthDate());
		
		//showing employee details using toString() method
		System.out.println(e1);
		
		
		//
		//creating object of employee parameterized constructor
		//
		
		Employee e2= new Employee(300,"Iron man",new MyDate(9,9,9999));
		
		//using the display method
		e2.display();
		

	}

}
