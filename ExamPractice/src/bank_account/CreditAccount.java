package bank_account;

public class CreditAccount extends Account  {

	public double creditLimit = 1000;
	public double creditRate = 0.1;
	
	public CreditAccount(String accountNumber) {
		super(accountNumber);
	}
	
	public  CreditAccount(String accountNumber, String branch) {
		super(accountNumber, branch);
	}
	
	public boolean withdraw(double amount) {
		this.assertPositive(amount);
		
		double newBalance = amount + this.balance;
		boolean canWithdraw = newBalance <= this.creditLimit;
		if (canWithdraw)
			this.balance = newBalance;
		
		return canWithdraw;
	}
	
	public void deposit(double amount) {
		this.assertPositive(amount);
		
		this.balance -= amount;
	}
	
	public void computeMonthlyIntrest() {
		double rate = this.balance < 0 ? Account.interestRate : this.creditRate;
		this.balance *= (1 + rate);
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder(super.toString());
		str.append("\n\tCredit Limit: " + this.creditLimit);
		return str.toString();
	}
}
