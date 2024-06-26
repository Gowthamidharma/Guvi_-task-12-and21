package introtask8;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare and initialise variable
		 int count = 0;
		//get input from user
		 Scanner sc = new Scanner(System.in);
	     
	      System.out.println("Enter a number ");
	      int num = sc.nextInt();
	      //while loop start the count
	      while(num!=0){
	         num /=10;
	         ++count;
	      }
	      System.out.println("Number of digits  entered  are  " +count);

	}

}
