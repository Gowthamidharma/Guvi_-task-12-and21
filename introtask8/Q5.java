package introtask8;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check for a prime no
		//declare and initialise var
		
		int num;
		int i;
		int m = 0;
		int check =0;
		
		// get input
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter  a number to check for prime ");
		//store input
		num=sc.nextInt();
		m=num/2;
		//if condition to check prime
		if (num==0 || num==1) {
			System.out.println(num + " Is not a Prime number");
			}
		else {
			for(i=2;i<=m;i++) {
		
			if(num%i==0) {
				System.out.println(num + " Is not a Prime number");
				check=1;			
			break;
		}
			
		}
		
		
			if(check==0) {
				System.out.println(num + " Is  a Prime number");
				
			
			}	// end of else		

		}
	}
}

	
		
		
		

	


