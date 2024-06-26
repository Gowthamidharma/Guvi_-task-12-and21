package oopsbasicconcept;

public class Calsinstancevariable {
	// when a variable is declared inside the class
	// and outside method, then its a instance variable
	int a = 50;
	int b = 10;
	int c;
	
	public void div() {
		c= a/b;
		System.out.println("Division " + c);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calsinstancevariable obj2 = new Calsinstancevariable();
		obj2.div();

	}

}
