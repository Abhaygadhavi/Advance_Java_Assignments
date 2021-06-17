package Assignment1;

import java.util.Scanner;
class Fibonacci {
       
    public static  int n1=0,n2=1,n3,i;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of terms for fibonacci:");
        int count=scan.nextInt();
        if(count==1){  
            System.out.println("Series is:"+n1);      
        }
        else if(count==2){
             System.out.print(n1+" "+n2);
        }
        else{
            System.out.print(n1+" "+n2);
            fibonacci(count);
        }
    }
    static void fibonacci(int count){
    for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
    {    
        n3=n1+n2;    
        System.out.print(" "+n3);    
        n1=n2;    
        n2=n3;    
    }
	 
}  
}  