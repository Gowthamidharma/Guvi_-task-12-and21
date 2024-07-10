package task10;

public class GreenTeasubclass  extends Tea {
	String greentea;
	
	// override the prepare tea method
	
	public void PrepareTea(String ginger,String water) {
		
		greentea=ginger+water;
		System.out.println("Greentea with " + greentea + AddSugar("Sugar"));
		
	}


}
