package task10;



public class Herbalteasubclass extends Tea {
	String HerbalTea;
	
	//override the prepare tea
	public void PrepareTea(String honey,String tulsi,String water) {
		
		HerbalTea= honey+tulsi+water;
		System.out.println("Herbal Tea with " + HerbalTea);
		
	
		
	}

}
