package Assignment1;

import java.util.Scanner;

public class ArmstrongNumberCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("enter count:");
        int n=scan.nextInt();
        
        System.out.println("first "+n+" Armstrong numbers are: ");
        armstrongCount(n);

	}
	public static void armstrongCount(int count) {
		int first=152,rem,sum,temp;
		while(count!=0)
		{
			first++;
			temp=first;
			sum=0;
			while(first>0)  
	        {  
				rem=first%10;  
				first=first/10;  
				sum=sum+(rem*rem*rem);  
	        }
			if(sum==temp)
			{
				System.out.print(temp+" ");
				count--;
			}
			first=temp;
			
		}
	}
	

}
