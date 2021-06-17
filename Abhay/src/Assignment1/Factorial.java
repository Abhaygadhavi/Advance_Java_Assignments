package Assignment1;

import java.util.Scanner;
class Factorial {
    public static int fact(int num){
        
        if(num==0)
            return 1;
        else
            return(num*fact(num-1));
    }    
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("enter number for factorial:");
        int number=scan.nextInt();
        if (number<0)
        {
            System.out.println(" error ");
        }
        else{
        int factorial=fact(number);
        
        System.out.println("factorial of "+number+" is "+factorial);
        }
    }
}