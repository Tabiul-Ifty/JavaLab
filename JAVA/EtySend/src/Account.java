
public class Account {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	Account(){
		System.out.println("account created");
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double dipositeMoney(double amount) {
		return balance+amount;
	}
	public double withdraweMoney(double amount) {
		return balance-amount;
	}

}
