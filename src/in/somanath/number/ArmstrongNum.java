package in.somanath.number;

import java.util.Scanner;

public class ArmstrongNum {
	
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			int x=s.nextInt();
			boolean k=armstrongNum(x);
			if(k) {
				System.out.println("armstrong");
			}
			else System.out.println("not an armstrong"); 
		}
	}

	static boolean armstrongNum(int x) {
		
		int dc=digitCount(x);
		
		int temp=x;
		int sum=0;
		
		while(x!=0) {
			int r=x%10;
			sum=sum+pow(r,dc);
			x=x/10;
			
		}
		if(sum== temp)
			return true;
		else 
			return false;
				
	}

	private static int digitCount(int x) {

		if(x<10)
			return 1;
		return 1+digitCount(x/10);
	}

	private static int pow(int x, int dc) {

		if(dc==0)
			return 1;
		return x*pow(x,dc-1);
	}
}
