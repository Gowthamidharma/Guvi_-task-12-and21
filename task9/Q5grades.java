package task9;

import java.util.Scanner;

public class Q5grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare the variable
		int marks;
		char grade=0;
		//get input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks ");
		marks = sc.nextInt();
		// if statemnet
		if(marks>100) {
			System.out.println("Invalid Input");
			}
		else if(marks==100) {
			grade='S';
			//System.out.println(grade);
			
			}
		else if(marks<=99 && marks>=90) {
			grade='A';
			//System.out.println(grade);
			
		}
		else if(marks<=89 && marks>=80) {
			grade='B';
			//System.out.println(grade);	

	}
		else if(marks<=79 && marks>=70) {
			grade='Ç';
			//System.out.println(grade);
		}
		else if(marks<=69 && marks>=60) {
			grade='D';
			//System.out.println(grade);
		}
		else if(marks<=59 && marks>=50) {
			grade='E';
			//System.out.println(grade);
		}
		
		else {
			
			grade='F';
						
		}
		// why asking to initialise
		System.out.println(grade);

	}
}
