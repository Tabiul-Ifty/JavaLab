public class Jasshi {
	
	/*static double a=0;
	static double b=2;
	static double n=5;*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double a=5;
		 double b=3;
		 double n=5;

		//for(int i=0; i<=n-1;i++)
		//{
			//if(i==0)
			
				double res1 = a+Math.pow(2, 0)*b;
			
			//if(i==1)
			
				double res2 = a+Math.pow(2, 1)*b;
			
			//if(i==2)
			
				double res3 = a+Math.pow(2, 2)*b;
			
			//if(i==3)
			
				double res4 = a+Math.pow(2, 3)*b;
			
			if(i==4)
			
				double res5 = a+Math.pow(2, 4)*b;
			
					
		}
		
		//for(int j=0;j<=n-1;j++)
		
			/*double s0 = res1;
			double s1 = s0+ Math.pow(2, 1)*b;
			double s2 = s1+ Math.pow(2, 2)*b;
			double s3 = s2+ Math.pow(2, 3)*b;
			double s4 = s3+ Math.pow(2, 4)*b;
			
			System.out.println(s0 + ","+ s1 +","+ s2 +"," + s3 +"," + s4);*/
				
				for(int j=0;j<=n-1;j++) {
					
					double s = a+Math.pow(2, j)*b;
					
					double R = s+ a+Math.pow(2, j)*b;
					
					System.out.println(R-8);
				}
		
	}

}