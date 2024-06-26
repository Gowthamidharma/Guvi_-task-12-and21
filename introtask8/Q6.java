package introtask8;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//factorial of a number
		//declare and initialise var
		int i;
		int fact=1;
		int num;
		//get input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
		//store var
		num = sc.nextInt();
		// for condition to find the factorial
		
		for(i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		System.out.println(" Factorial of " + num+ " is " + fact);
		
		
		

	}

}
