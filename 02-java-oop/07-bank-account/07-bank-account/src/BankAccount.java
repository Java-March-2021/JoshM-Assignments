
public class BankAccount {
	private String accNum = "";
	private double chkBalance = 0, savBalance = 0;
	private static int accounts;
	private static double BAMoney = 0;

	private String accGenerater() {
		double random = Math.random();
		random = random * 1000000000 + 999999999;
		int num = (int) random;
		System.out.println(num);
		return String.valueOf(num);
	}

	public BankAccount() {
		super();
		this.accNum = accGenerater();
		accounts++;
	}

	public BankAccount(String accNum) {
		super();
		this.accNum = accGenerater();
		accounts++;
	}

	public BankAccount(String accNum, double chkBalance) {
		super();
		this.accNum = accGenerater();
		this.chkBalance = chkBalance;
		accounts++;
	}

	public BankAccount(String accNum, double chkBalance, double savBalance) {
		super();
		this.accNum = accGenerater();
		this.chkBalance = chkBalance;
		this.savBalance = savBalance;
		accounts++;
	}

	public String getAccNum() {
		return accNum;
	}

	public double getChkBalance() {
		return chkBalance;
	}

	public double getSavBalance() {
		return savBalance;
	}

	public static int getAccounts() {
		return accounts;
	}

	public static double getBAMoney() {
		return BAMoney;
	}

	public void deposit(BankAccount acc, double deposit) {
		this.chkBalance += deposit;
		BAMoney += deposit;
		System.out.println("Deposit of: " + deposit + " was entered");
	}

	public void withdraw(BankAccount acc, double withdraw) {
		if (withdraw > this.chkBalance) {
			System.out.println("Can not withdraw Insufficient funds");
		} else {
			this.chkBalance -= withdraw;
			BAMoney -= withdraw;
			System.out.println("A withdrawal of: " + withdraw + "was taken out");
		}
	}
	
	public void accInfo () {
		System.out.println("Checking Account: $"+this.getChkBalance());
		System.out.println("Savings Account: $"+this.getSavBalance());
	}

}