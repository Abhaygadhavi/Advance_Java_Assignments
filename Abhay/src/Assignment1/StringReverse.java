package Assignment1;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the string to reverse: ");
        String str=scan.nextLine();
        System.out.println("reversed string is : ");
        System.out.println(reverse(str));

	}
	public static String reverse(String str) {
		
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		return rev;
		
	}

}
