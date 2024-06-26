package task9;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// get input
		String str;
		String reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
	    str= sc.next();
	    
	    //iterating the string value storing it in reverse variable
	    for(int i= str.length() -1 ; i>=0 ;i--) {
	    	reverse = reverse + str.charAt(i);
	    		    	
	    }
	    System.out.println("Reversed String is "  + reverse);
	    		
	}

}
