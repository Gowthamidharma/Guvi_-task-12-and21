package codekatainputoutput;

import java.util.Scanner;

public class Program2 {
	// error
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] num= new int[10];
		int i;
		
		
		for( i=0; i<num.length; i++) {
			num[i]= sc.nextInt();
			
		}
		for ( i=0; i < num.length; i++) {
			System.out.print(num[i]+ " ");
		}		

	}

}
