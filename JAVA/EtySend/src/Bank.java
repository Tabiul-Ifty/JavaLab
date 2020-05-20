
public class Bank {
	private String name;
	private SavingsAccount sa;
	private FixedAccount fa;
	
	public void setName(String name) {
		this.name=name;
	}
	 public String getName() {
	 return name;
	}
	 
	 public void setSavingsAccount(SavingsAccount sa) {
		 this.sa=sa;
	 }
	 public SavingsAccount getSavingsAccount() {
		 return sa;
	 }
	 
	 public void setFixedAccount(FixedAccount fa) {
		 this.fa=fa;
	 }
	 
	 public FixedAccount getFixedAccount()
	 {
		 return fa;
	 }
	 
	

}
