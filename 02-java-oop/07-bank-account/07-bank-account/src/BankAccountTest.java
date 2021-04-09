
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount JoshAccount = new BankAccount();
		JoshAccount.withdraw(JoshAccount, 20000);
		JoshAccount.deposit(JoshAccount, 500001);
		JoshAccount.accInfo();

	}

}
