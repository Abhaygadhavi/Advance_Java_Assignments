
/*
 * Author: Abhay Gadhvi
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */


//this program counts the number of vowels present in string
package Assignment1;

import java.util.Scanner;
public class VowelCount {
   public static void main(String args[]){
      
      System.out.println("Enter a String :");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      
      System.out.println("Number of vowels in the given String is "+countVowels(str));
   }
   
   //method for counting vowels in string
   public static int countVowels(String str) {
	   int count = 0;
	   for (int i=0 ; i<str.length(); i++){
	         char ch = str.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	            count ++;
	         }
	      }
	   return count;
   }
}