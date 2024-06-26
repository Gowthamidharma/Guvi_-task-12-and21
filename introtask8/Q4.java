package introtask8;

import java.util.Scanner;



public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare var

		int card;
		int cash;
		int swap;
		//get input
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter the input for card");
		card=sc.nextInt();
		System.out.println("Enter the input for cash");		
		cash= sc.nextInt();
		
		// swapping the value of the variables
		swap=card;
		card=cash;
		cash=swap;
		System.out.println("After Swap card = " +card);
		System.out.println("After Swap cash = " +cash);
				
	}

}
