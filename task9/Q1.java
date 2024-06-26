package task9;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare variable and assign
		String original;
		String reverse = "";
		//get input 
		Scanner sc = new Scanner(System.in);		
		 System.out.println("Enter a string to check if it is a palindrome");  
	      original = sc.nextLine(); 
	      //storing the user string in int length
	      int length = original.length();
	      //iterating the string as integer
	      for ( int i = length - 1; i >= 0; --i ) {
	    	  // assigning the iterated string in reverse
	         reverse = reverse + original.charAt(i); 
	      }
	         // declaring a  if condition
	         if (original.toLowerCase().equals(reverse.toLowerCase())) {  
	         System.out.println(original + "  string is a palindrome.");  
	         }
	         else  {
	         System.out.println( original +"  string isn't a palindrome.");   
	   }  
	}  
		
	}







