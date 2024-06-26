package oopsbasicconcept;

public class Calculatorwithlocalvariable {
	// we are giving static for variable a and c because the method is static
    static int a= 50;
	int b=10;
	static int c=5;
	
	// this is program for local variable 
	// local variable is accessed only inside the method
	// so we have to declare the variable inside the method
	
	
	public void add() {
		// creating a local variable
		 int d=a+b;
		System.out.println("Addition =" + d);
			
	}
	// since the method is static we should fix the variable also as static	
	public static int sub() {
		int d = a-c;
		return d;
		
	}
	public  static void mul() {
		int d=a*c;
		System.out.println("Multiplication= " + d);
		}
		
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Calculatorwithlocalvariable	obj1 = new Calculatorwithlocalvariable();
			
		
		obj1.add();		
		System.out.println("Subraction  =" + sub());
		mul();
	}
}
		
		

	

