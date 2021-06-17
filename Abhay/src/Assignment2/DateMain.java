
/*
 * Author: Abhay Gadhvi
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


//this program displays the date
package Assignment2;

class MyDate {

	//private data members
		private int day,month,year;
		
	//method to initialize the date	
		public void initDate(int x,int y,int z) {
			
			day=x;
			month=y;
			year=z;
			
		}
	//method which displays the date
		public void printDate() {
			System.out.println(day+"/"+month+"/"+year);
		}


}

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the MyDate object
		MyDate d = new MyDate();
		MyDate d2 = new MyDate();
		d.initDate(8,6,2021);
		d.printDate();
		d2.initDate(5,9,2011);
		d2.printDate();

	}

}

