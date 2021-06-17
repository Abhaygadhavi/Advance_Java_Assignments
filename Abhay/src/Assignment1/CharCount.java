package Assignment1;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=scan.nextLine();
        System.out.println("enter the character you want to count: ");
        char ch=scan.next().charAt(0);
        System.out.println("no. of occurence of character "+ch+" in string "+str+" is: "+countChar(str,ch));
        
        
	}
	public static int countChar(String str,char ch) {
		char ch2[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch2.length;i++)
		{
			if(ch2[i]==ch)
				count++;
		}
		return count;
	}

}
