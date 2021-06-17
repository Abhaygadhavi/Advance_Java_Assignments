/*
 * Author: Abhay Gadhvi
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


package Assignment2;

class MyDateC {

	//private data members
		private int day,month,year;
		
	//method to initialize the date	
		MyDateC(){
			
			day=6;
			month=6;
			year=2006;
			
		}
	//method which displays the date
		public void printDate() {
			System.out.println(day+"/"+month+"/"+year);
		}


}
public class DateMainC {

	public static void main(String[] args) {
		MyDateC d = new MyDateC();
		MyDateC d2 = new MyDateC();
		d.printDate();
		d2.printDate();


	}

}
