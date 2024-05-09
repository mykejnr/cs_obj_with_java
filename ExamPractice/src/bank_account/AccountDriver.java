package bank_account;

public class AccountDriver {

	public static void main(String[] args) {
		testSavingsAccount();
		//testCreditAccount();
	}
	
	public static void testSavingsAccount() {
		SavingsAccount account = new SavingsAccount("722393800323443");
		account.deposit(4_500);

		System.out.println(account);
		
		account.withdraw(930);
		System.out.println(account);
	}
	
	public static void testCreditAccount() {
		CreditAccount account = new CreditAccount("766393800323443");
		account.withdraw(300);
		account.deposit(450);
		System.out.println(account);
	}

}
