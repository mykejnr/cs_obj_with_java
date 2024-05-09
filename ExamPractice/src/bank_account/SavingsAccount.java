package bank_account;

// A subclass "SavingsAccont" inherits from the base class "Account"
public class SavingsAccount extends Account {
	
	public SavingsAccount(String accountNumber) {
		super(accountNumber);
	}
	
	// Point number 3 (Descriptions of Savings Account)
	// There must be the ability to withdraw
	public boolean withdraw(double amountToWithdraw) {
		this.assertPositive(amountToWithdraw);
		if (this.balance >= amountToWithdraw) {
			this.balance = this.balance - amountToWithdraw;
			return true;
		}
		return false;
	}
	
	// Point number 3 (Descriptions of Savings Account)
	// There must be the ability to deposit
	public void deposit(double amount) {
		this.assertPositive(amount);
		this.balance += amount;
	}

	
	// Point number 3 (Descriptions of Savings Account)
	// add interest to the account balance on monthly basis
	public void computeMonthlyInterest() {
		double interest = this.balance * Account.interestRate;
		this.balance = this.balance + interest;
	}
}
