package Assignment1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number for multiplication table:");
        int n=scan.nextInt();
        System.out.println("multiplication table for number "+n+" is:");
        
        mulTable(n);
	}
	public static void mulTable(int n) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
