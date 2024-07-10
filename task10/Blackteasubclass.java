package task10;

public class Blackteasubclass extends Tea {
	
	String blacktea;
	
	
	//override the prepare tea method
	 
	public void PrepareTea(String tealeave,String honey,String water) {
		
		blacktea= tealeave+honey+water;
        		
	System.out.println("Black Tea with " + blacktea );

}
	
	
}
