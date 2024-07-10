package task10;



public class Teamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tea obj =new Tea();
		obj.PrepareTea("Tealeves","Water","Honey");
		obj.PrepareTea("Tealeaves", "Water");
		obj.Addmilk("Milk");
		obj.AddSugar("Sugar");
		
		
		Herbalteasubclass obj1 =new Herbalteasubclass();
		obj1.PrepareTea("Honey", "Tulsi", "Water");
		
		GreenTeasubclass obj2 =new GreenTeasubclass();
		obj2.PrepareTea("Ginger","Water");
		
		Blackteasubclass obj3 =new Blackteasubclass();
		obj3.PrepareTea("Tealeaves", "Honey", "Water");
		
		
		
		
		

	}

}
