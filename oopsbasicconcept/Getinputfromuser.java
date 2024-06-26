package oopsbasicconcept;

import java.util.Scanner;

public class Getinputfromuser {
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 
	 
	

	
	
	public void add() {
		//we assign a local variable d 
		  int d=a+b;
		System.out.println("Addition =" + d);
			
	}
	//we pass the value to method in case of instance variable
	public int sub1(int d,int e) {
		// we are differentiating between the local variable and instance variable 
		//the keyword "this"is used
		// we assign the passed value to the instance variable		
		this.d=d;
		this.e=e;
		a=d-e;
		return a;
				
	}
	
	// we pass the value to the method incase of a local variable
		public int sub(int num1, int num2) {
			// we assign the value to the variable
			int q= num1;
			int p=num2;
			int s=q-p;
			return s;
					
		}
		
	
	
	
	
	public  void mul() {		
		
		e = a*b;
		d=a*c;
		
		System.out.println("Multiplication a*c " + d);
		System.out.println("Mul of a*b =" +e);
		}
		
 
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Getinputfromuser obj1 = new Getinputfromuser();
		Scanner sc = new Scanner(System.in);
		
		// we get the value from the user through scanner class
		System.out.println("Enter the value for  a to perform addtion operation " );
		// we assign the value to the variable
		obj1.a=sc.nextInt();
		System.out.println("Enter the value for b to perform addtion operation ");
		obj1.b=sc.nextInt();
		obj1.add();
		
		
		// we get the value from the user through scanner class
		System.out.println("Enter the value for d to perform subtraction" );
				 
		int d=sc.nextInt();
		System.out.println("Enter the value for e to perform subtraction" );
		int e=sc.nextInt();
		System.out.println("Subtraction " + obj1.sub1(d,e));
				
		
		// we get the value from the user through scanner class
		System.out.println("Enter the value for q to perform subtraction" );
		// we pass the value to the method in case of a local variable
		int num1 =sc.nextInt();
		System.out.println("Enter the value for p to perform subtraction" );
		int num2=sc.nextInt();
		System.out.println("Subtraction " + obj1.sub(num1,num2));
						
		// we get the value from the user through scanner class
		
		System.out.println("Enter the value for  a to perform  multiplication operation " );
		// we assign the value to the variable
		obj1.a=sc.nextInt();
		
		System.out.println("Enter the value for b to perform multiplication operation");
		obj1.b=sc.nextInt();
		System.out.println("Enter the value for c to perform multiplication operation  ");
		obj1.c=sc.nextInt();
		obj1.mul();
		
		
		
		

	}

}
