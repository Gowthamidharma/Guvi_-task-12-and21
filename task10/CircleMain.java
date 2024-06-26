package task10;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle objcircle1 = new Circle();
		objcircle1.setradius(8.00);
		objcircle1.getradius();
		// how to round off two decimal places
		System.out.println( objcircle1.getarea());
		
		Circle objcircle2 = new Circle(12, "brown");
		objcircle2.getradiusarg();
		objcircle2.getcolor();
		//how to round off two decimal places
		System.out.println("The cicumference and color  of circle for the given radius is " + objcircle2.getCircum());
		
			}

}
