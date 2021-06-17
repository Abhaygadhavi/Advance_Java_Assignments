package Assignment1;

import java.util.Scanner;

public class PrimeNumberCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("enter count:");
        int n=scan.nextInt();
        System.out.println("first "+n+" prime numbers are: ");
        primeCount(n);

	}
	public static void primeCount(int count) {
		int ct=0,n=0,i=1,j=1;

		for(n=0;n<count;i++) {
			ct=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					ct++;
				}
			}
			if(ct==2) {
				System.out.printf(" %d ",i);
				n++;
			}
		}
	}

}
