package Assignment1;

import java.util.Scanner;
class Armstrong {
       
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number:");
        int n=scan.nextInt();
        armstrong(n);
    }
    static void armstrong(int n)
    {
         
        int sum=0,a,temp;  
        temp=n;  
        while(n>0)  
        {  
        a=n%10;  
        n=n/10;  
        sum=sum+(a*a*a);  
        }  
        if(temp==sum)  
        System.out.println("armstrong number");   
        else  
        System.out.println("Not armstrong number");   
     }

}  