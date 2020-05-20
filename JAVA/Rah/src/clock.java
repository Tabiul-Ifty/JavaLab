
public class clock {
	private int hour;
	private int minute;
	private clock c;

	public clock(int hour, int minute)
	{
		this.hour=hour;
		this.minute=minute;
	}
	public clock(int minute)
	{
		this.minute=minute;
	}
	
	public clock( clock c) {
		this.c=c;
	}
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour= ((hour >=0 && hour<=23)?hour:0);
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute= ((minute >=0 && minute<=59)?minute:0);
	}
	
	
	public String toString() {
		return String.format("%02d : %02d", getHour(),getMinute());
	}
	
	
	public clock add(int min) {
		this.minute = min;
		return this;
	}
	
	public clock add (clock c ) {
		this.c=c;
		System.out.println(toString());
		return c;
	}
	
	
}
