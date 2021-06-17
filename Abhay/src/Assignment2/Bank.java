
/*
 * Author: Abhay Gadhvi
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */

package Assignment2;


class Account{
	
	//private non static members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	
	//private static data members
	private static float interestRate;
	private static int count=0;
	
	static
	{
		interestRate=0.05f;
	}
	
	//default constructor
	Account(){
		Account.count++;
		this.accNo=122;
		this.ownerName="abhay";
		this.balance=2000;
		this.durationYears=2;
		System.out.println("default constructor:");
		
		
	}
	
	//parameterized constructor
	Account(int accNo,String ownerName,double balance,float years){
		
		Account.count++;
		this.accNo=accNo;
		this.ownerName=ownerName;
		this.balance=balance;
		this.durationYears=durationYears;
	}
	
	
	//setter and getter methods
	public void setAccNo(int a) {
		this.accNo=a;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setOwnerName(String o) {
		this.ownerName=o;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setBalance(double b) {
		this.balance=b;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setDurationYears(float d) {
		this.durationYears=d;
	}
	
	public float getDurationYears() {
		return durationYears;
	}
	
	public static void setInterstRate(float i) {
		Account.interestRate=i;
	}
	
	public static float getInterstRate() {
		return interestRate;
	}
	
	public static int getCount() {
		return count;
	}
	
	//method to calculate interest
	public void calculateInterest() {
		double si=((balance*durationYears*interestRate)/100);
		System.out.println("simple interest is:"+si);
	}
	
	//displaying the details
	public void printDetails() {
		System.out.println("owner name: "+this.ownerName+"\nAccount no:"+this.accNo+"\nBalance: "+
				this.balance+"\nDuration: "+this.durationYears+"\ninterest rate:"+Account.interestRate);
	}
	
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("interest is: "+ Account.getInterstRate());
		//first object created
		Account a1= new Account();
		
		a1.setAccNo(1);
		a1.setBalance(3000);
		a1.setDurationYears(1.0f);
		a1.setOwnerName("Abhay");
		Account.setInterstRate(0.05f);
		
		//printing object 1 details
		System.out.println("ownername: "+a1.getOwnerName());
		System.out.println("Account number: "+a1.getAccNo());
		System.out.println("Balance: "+a1.getBalance());
		System.out.println("Duration: "+a1.getDurationYears());
		
		a1.calculateInterest();
		System.out.println(" ");
		
		//parameterized constructor
		System.out.println("parametarized constructor:");
		Account a2= new Account(6,"abcd",3000,3);
		a2.printDetails();
		
		System.out.println("number of objects are:"+Account.getCount());
		
	}

}
