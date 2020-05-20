
public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account newacc = new Account();
		
		newacc.setAccountHolderName("Rick");
		newacc.setAccountNumber("0159753");
		newacc.setBalance(5000);
		
		SavingsAccount sa= new SavingsAccount();
		
		sa.setAccountNumber("7539631489");
		sa.setAccountHolderName("Onizuka");
		sa.setBalance(8500);
		sa.setInterestRate(8.5);
		
		FixedAccount fa = new FixedAccount( );
		
		fa.setAccountNumber("123987645");
		fa.setAccountHolderName("Miyabi");
		fa.setBalance(90000);
		fa.setTenureYear(5);
		
		Bank b = new Bank( ) ;
		
		b.setName(" DBL ");
		b.setSavingsAccount(sa);
		b.setFixedAccount(fa);
		
		System.out.println("Account Number :"+b.getSavingsAccount().getAccountNumber());
	//	System.out.println("Account Holder Name :"+b.getSavingsAccount().getAccountHolderName());
	//	System.out.println("Balance :"+b.getSavingsAccount().getBalance());
	//	System.out.println("Interest Rate:"+b.getSavingsAccount().getInterestRate());
		
		
		
		
		
		

		/*System.out.println(sa.getInterestRate());
		System.out.println(sa.getBalance());
		System.out.println(sa.getAccountHolderName());
		newacc.getAccountHolderName();
		newacc.getAccountNumber();
		newacc.getBalance();*/
		
		
		
		
		
		

	}

}
