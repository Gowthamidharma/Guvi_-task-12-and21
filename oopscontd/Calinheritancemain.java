package oopscontd;

import java.util.Scanner;

public class Calinheritancemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Calchild obj = new Calchild();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for A and B to perform addtion ");
		obj.a=sc.nextInt();
		obj.b=sc.nextInt();
		obj.add();
		
		System.out.println("Enter the value for a and b perform  subtraction");
		obj.a=sc.nextInt();
		obj.b=sc.nextInt();		
		obj.sub();
		
		
		System.out.println("Enter the value for a and b perform  division");
		obj.d=sc.nextInt();
		obj.e=sc.nextInt();	
		obj.div();	
		

		System.out.println("Enter the value for A and B perform  Multiplication");
		obj.p=sc.nextInt();
		obj.q=sc.nextInt();	
		obj.mul();
		sc.close();

	}

}
