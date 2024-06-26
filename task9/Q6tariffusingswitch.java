package task9;


import java.util.Scanner;


public class Q6tariffusingswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare and initialise var
		int month,n;
		float rent, t=0;
		double r=0;
		// get input
		Scanner sc= new Scanner(System.in);
		month = sc.nextInt();
		rent = sc.nextFloat();
		n= sc.nextInt();
		//calculation
		t=rent*n;
		r = ((rent+(rent*0.2))*n);
		
		//logic
		switch(month) {
		//january to march there is no tariff so print t
		case 1:
			System.out.printf("%.2f",t);
			break;
		case 2: 
			
			System.out.printf("%.2f",t);
			break;
			
		case 3:
		      System.out.printf("%.2f",t);
		      break;
		case 4:
			// for april to june the traiff is more so we print r
			System.out.printf("%.2f",r);
		      break;
		case 5:
			System.out.printf("%.2f",r);
		      break;
		 case 6:
			 System.out.printf("%.2f",r);
		      break;
		 case 7:
			 //july to oct no tariff so print t
			 System.out.printf("%.2f",t);
		      break;
		 case 8:
			 System.out.printf("%.2f",t);
		      break;
		 case 9:
			 System.out.printf("%.2f",t);
		      break;
		 case 10:
			 System.out.printf("%.2f",t);
		      break;
		 case 11:
			// for nov to dec the traiff is more so we print r
			 System.out.printf("%.2f",r);
		      break;
		 case 12:
			 System.out.printf("%.2f",r);
		      break;
		      default: 
		    	  System.out.println("Invalid Input");
		    break;
		    		
		}
	
				
	}

}
