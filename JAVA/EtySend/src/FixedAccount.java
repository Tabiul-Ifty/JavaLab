
public class FixedAccount extends Account {
	
	private int tenureYear;
	
	FixedAccount(){
		System.out.println("fixedaccount created");
	}

	public int getTenureYear() {
		return tenureYear;
	}

	public void setTenureYear(int tenureYear) {
		this.tenureYear = tenureYear;
	}
	
	

}
