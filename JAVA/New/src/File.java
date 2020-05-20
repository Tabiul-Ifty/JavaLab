import java.util.Scanner;

public class File {
	
	public int height,weidth;
	File(int height, int weidth){
	
	this.	height=height;
	this.	weidth=weidth;
	}
	
	double triArea() {
		return (height*weidth)/2;
	}

	public static void main(String[] args) {
		
		System.out.println("Hellow world");
		
		Scanner object = new Scanner(System.in);
		
		System.out.print("Enter the Height : ");
		int Height =object.nextInt();
		
		System.out.print("Enter the Weight : ");
		int Weidth =object.nextInt();
		
		File newobject = new File (Height,Weidth);
		
		System.out.print("Area is : ");
		double area = (double)(Height*Weidth)/2;
		
		System.out.println(area);
		System.out.println("The area is " + newobject.triArea());

	}

}
