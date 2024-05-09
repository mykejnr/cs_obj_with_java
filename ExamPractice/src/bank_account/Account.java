package bank_account;

public class Account {
	// The following properties here a common to (inherited by) both
	// SavingsAccount and CreditAccount
	// 1. accountNumber
	// 2. branch
	// 3. balance
	// 4. interestRate
	public final String accountNumber;
	protected String branch;
	protected double balance = 0.0;
	public static double interestRate = 0.1; // 10 percent;
	
	public Account(String accountNumber) {
		this(accountNumber, "Head Quarters");
	}
	
	public Account(String accountNumber, String branch) {
		this.accountNumber = accountNumber;
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}
	
	// This is just a helper method that is called
	// to assert (test/ensure) that an amount that is passed
	// in is not a negative number
	protected void assertPositive(double amount) {
		if (amount < 0)
			throw new IllegalArgumentException("Amount cannot be less than 0");
	}
	
	// --Point number 4. (Description of Savings Account, Descriptions of Credit Account)
	// The "toString()" methods helps us to display (using System.out.println)
	// the details of the account
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("Account Number: " + this.accountNumber);
		str.append("\n\tBranch: " + this.branch);
		str.append("\n\tBalance: " + this.balance);
		
		return str.toString();
	}
}
