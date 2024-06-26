package introtask8;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare n initialise variable
		String word;
		int count=0;
		//get the input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word to be counted");
		word=sc.next();
		// iterate through each character of the string
		for(int i =0;i< word.length();i++) {
			//Increment the count
			count++;
			
		}
		System.out.println("Lenght of String =" + count);
	
		
		
		
		
		

	}

}
