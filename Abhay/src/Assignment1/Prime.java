package Assignment1;

import java.util.Scanner;
class Prime {
       
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number to check prime or not:");
        int number=scan.nextInt();
        if(number==0||number==1){  
            System.out.println(number+" not prime number");      
        }
        else{
            String primeornot=prime(number);
            System.out.println("number "+number+" is "+primeornot);
        }
    }
    static String prime(int n){
        int temp,i;
        boolean isPrime=true;
        for(i=2;i<=n/2;i++)
        {
            temp=n%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            return "Prime";
        else
            return "Not Prime";
        }
}  