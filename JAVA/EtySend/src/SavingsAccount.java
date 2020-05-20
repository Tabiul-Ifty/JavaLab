
public class SavingsAccount extends Account{
	private double interestRate;
	
	SavingsAccount(){
		System.out.println("savingsaccount created");
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	

}
