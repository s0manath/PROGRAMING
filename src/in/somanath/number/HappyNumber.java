package in.somanath.number;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int x=s.nextInt();
			boolean e=happyNum(x);
			if(e)
				System.out.println(x+" is s Perfect Number");
			else
				System.out.println(x+" is not a Perfect Number");
		}
	}

	private static boolean happyNum(int x) {
		
		while(x>9) {
			int sum=0;
			while(x!=0) {
				int rev=x%10;
				sum =sum+rev*rev;
				x=x/10;
			}
			x=sum;
		}
		if(x==1||x==7)
			return true;
		else
			return false;
	}

}
