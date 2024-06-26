package task9;

public class Q3Numberincreaingpattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables and initialise
		int n = 4,num = 1, i,j;
		//outer loop to handle the  row 
		
		for(i=1; i<=n; i++) {
			//inner loop to handle the  columns
			for(j=1; j<=i; j++)  {
				 
				System.out.print(num + " ");
				num++;
			}
		
		System.out.println();
		}

	}		
		

}

