package task10;

public class Person {
	//DeclaredType attributes
		private String VName;
		private int VAge;
		
		//parameterized constructor
		 public Person( String n, int age) {
			this.VName=n;
			this.VAge=age;
			
		}	
		
		// getter method to retrieve the input
		public void getname() {
			System.out.println("Name =" + VName);
			
			
		}
		
		
		public void getage() {
			System.out.println("Age =" + VAge);
			
		}
		
		
		

}
