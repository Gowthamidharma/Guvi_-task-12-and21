package task9;

public class Q4mirrorpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, i, j;
	      
		/*
		 * // Printing the upper part for (i = 1; i <= n; i++) { // inner loop to print
		 * spaces. for (j = 1; j < i; j++) { System.out.print(" "); } // inner loop to
		 * print value of j. for (j = i; j <= n; j++) { if(j==i||j==n||i==1)
		 * System.out.print("* "); else System.out.print("  "); }
		 * 
		 * // printing new line for each row System.out.println(); }
		 * 
		 * // Printing the lower part for (i = n - 1; i >= 1; i--) { // inner loop to
		 * print spaces. for (j = 1; j < i; j++) { System.out.print(" "); } // inner
		 * loop to print value of j. for (j = i; j <= n; j++) { if(j==i||j==n||i==1)
		 * System.out.print("* "); else System.out.print("  "); } // printing new line
		 * for each row System.out.println(); }
		 */

		int row = 5;
       //Outer loop for the rows 
		for( i =1; i<=row; i++){
			//Inner loop for Columns 
			for( j=1; j<=row; j++){ 
				if(j == i || j == row -i +1){
					System.out.print("*");
					}
				else
				{
					System.out.print(" "); 
					} 
				} 
			System.out.println(" ");
				}
		}


		
    }
	
		 
			
		
		
	
	


