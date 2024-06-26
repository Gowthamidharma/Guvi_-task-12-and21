package task10;

public class Account {
	  int Balance=1000;
	  int withdraw;
	  int deposit;
	  int newbalance;
	  int ClosingBalance;
	  double interest;
	 
	 
	public Account(int withdraw, int deposit) {
		
		this.withdraw=withdraw;
		this.deposit= deposit;	
		
	}
	
	public int getwithdraw() {
		//System.out.println("The Opening Balance " + Balance);
		return newbalance= Balance-withdraw;
	}
	
	
	public int getdeposit() {
		
		return ClosingBalance= getwithdraw()+deposit;
		
	}
	// What is this type of constructor called as with empty 
	// can we use the return value of one constructor in another constructor
	
	public Account() {
		
		System.out.println("Initial Balance is " + Balance);
		
	}
	
	public void setintr(double intrest) {
		 this.interest = intrest;
		
	}
	
	public double getintr() {
		return (getdeposit()*(interest/100));
		
	}
	
	
	
	

}
