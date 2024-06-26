package introtask8;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare variables
		int age;
		//get input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your current age");
		//store the input
		age =sc.nextInt();
		//if condition to print age is senior or not
		if(age<=59) {
			System.out.println("Not a senior cetizen");
		}
			else {
				System.out.println(" Senior cetizen");
			
		}
		
			

	}

}
