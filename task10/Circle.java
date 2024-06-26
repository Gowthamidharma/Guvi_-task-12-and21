package task10;



//how to work with no args constructor ,  

public class Circle {
	 private double Radius ;
	 private String color;
	
	 
	 // how to use no arg constructor 
	 // what is the purpose of no arg constructor 
		
		  public Circle() {
			  System.out.println("The area of circle");
		  
		  }
		 
	 public void setradius( double radius) {
			this.Radius= radius;
			
				}
		public double getradius() {
			
			return Radius;
			
			
		}
		
		public double getarea() {
			// area of circle pie* r sq
			return Math.PI*Radius*Radius;
			
		}
		
	// is it necessary to use this keyword for attributes	 
	public Circle (double r, String c ) {
		
		Radius = r;
		this.color = c;
		
		
	}
	
	public double getradiusarg( ) {
		return Radius ;
	}
	
	public String getcolor() {
		return color;
		
	}
	public double getCircum() {
		// circum of circle pie *2*r
			return Math.PI*2*Radius;
		
	}
	
	
	 
	
	
	 
}
