package oopsbasicconcept;

public class Calculator {
	// static variable is declared with a keyword static 
	// and it can be used any method of that class
	
	static int a= 50;
	static int b=10;
	static int c=5;
	static int d;
	

	
	
	public void add() {
		 d=a+b;
		System.out.println("Addition =" + d);
			
	}
	
	public static int sub() {
		 d=a-c  ;
		return d;
			
		
	}
	
	public  static void mul() {
		// the static keyword need not be used for a 
		//static method explicitly , because its inside the 
		// static method
		
		int e = a*b;
		d=a*c;
		
		System.out.println("Multiplication= " + d);
		System.out.println("Mul of a*b =" +e);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculator obj =new Calculator();
      obj.add();
      System.out.println("Subraction=" + sub());
      mul();
      
	}

}
