package task10;

import java.util.Scanner;

public class Accountmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Withdraw Amount= ");
		int withdraw=sc.nextInt();
		System.out.println("Deposit Amount= ");
		int deposit=sc.nextInt();
		Account objAccount= new Account(withdraw,deposit);		
		System.out.println("The Balance after withdraw  " + objAccount.getwithdraw());		
		System.out.println("The Closing balance after deposit  " + objAccount.getdeposit());
		
		
		System.out.println("No Args constructor");
		
		Account objAccount2 = new Account();
		objAccount2.withdraw=500;
		objAccount2.deposit=100;
		System.out.println("Balance after deposit " + objAccount2.getdeposit());
		
		System.out.println("The Balance after withdraw " + objAccount2.getwithdraw());
		objAccount2.setintr(0.10);
		System.out.println("Interest for Closing Balance " + objAccount2.getintr());
				
	}

}
