package task10;

public class Tea {
	
	String tulsi;
	String tealeave;
	String honey;
	String ginger;	
	String water;
	String milk;
	String sugar;
	
	
	
	
	
	
	public void PrepareTea(String tealeave,String water,String honey) {
		String basictea =tealeave+water;
		System.out.println("This is Basic Tea with " +basictea + Addmilk("Milk"));// calling milk method
		
		
		
		
	}
	
	// method overload
	  public void PrepareTea(String tealeave,String water) {
		  String basictea1=tealeave+water;
	  System.out.println("This is Basic Tea with " +basictea1  + AddSugar("Sugar")); // calling sugar method
	  
	  
	  }
	 
	public String  Addmilk(String milk) {
		this.milk= milk;
		
		return milk;
		
	}

	public String AddSugar(String sugar) {
		this.sugar=sugar;
		
		return sugar;
	}
}
