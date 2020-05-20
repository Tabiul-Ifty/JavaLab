import java.util.Scanner;
public class excption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		
		for ( count =0 ; ; ) {
		
	try {
		Scanner input1=new Scanner(System.in);
		//Scanner input2=new Scanner(System.in);
		System.out.println("First number: ");
		int first = input1.nextInt();
		System.out.println("second number: ");
		int second = input1.nextInt();
		int result = first / second ;
		System.out.println("The result is : " + result);
		break;
		}
	catch(Exception e) {
		System.out.println(e);
	}
	
	finally{
		
		System.out.println("finally called");
	}
	
}
	}
	
}
