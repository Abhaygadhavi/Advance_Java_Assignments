package Assignment1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the string: ");
		String S=scan.nextLine();
		
		if(checkPalindrome(S))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

	}
	public static boolean checkPalindrome(String S) {
		System.out.println("reversed string is : ");
		String S2= StringReverse.reverse(S);
        System.out.println(S2);
		if(S.equals(S2))
			return true;
		else
			return false;
	}

}
