package task9;

import java.util.Scanner;

public class Q7largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int x, y, z;
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        x = sc.nextInt();
		        System.out.print("Enter the second number: ");
		        y = sc.nextInt();
		        System.out.print("Enter the third number: ");
		        z = sc.nextInt();
		        if ( x > y )
		        {
		            if ( x > z )
		            {
		                System.out.println("Largest number: " + x);
		            }
		            else
		            {
		                System.out.println("Largest number: " + z);
		            }
		        }
		        else
		        {
		            if ( y > z )
		            {
		                System.out.println("Largest number: " + y);
		            }
		            else 
		            {
		                System.out.println("Largest number: " + z);
		            }
		        }
	
	
	}

}
