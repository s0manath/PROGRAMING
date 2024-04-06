package in.somanath;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int x=s.nextInt();
			boolean e=perfactNum(x);
			if(e)
			    System.out.println(x+" is a PerfectNumber");
			else
				System.out.println(x+" not a PerfectNumber");
		}
	}

	private static boolean perfactNum(int x) {
		
		int sum=0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0) {
				sum=sum+i;
			}
		}
		if(sum==x)
			return true;
		else
		    return false;
	}

}
