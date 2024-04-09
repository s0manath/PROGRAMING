package in.somanath.number;

import java.util.Scanner;

public class GreaterAndSmallerDigit {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.err.println("Enter the Number");
			int x=s.nextInt();
			int greater=greaterDigit(x);
			int smaller=smallerDigit(x);
			System.out.println(greater+" is greater Digit");
			System.out.println(smaller+" is Smaller Digit");
		}
	}

	private static int smallerDigit(int x) {
		
		int small=9;
		while(x!=0) {
			int r=x%10;
			if(r<small)
				small=r;
			x=x/10;
		}
		return small;
	}

	private static int greaterDigit(int x) {
		int big=-9;
		while(x!=0) {
			int r=x%10;
			if(r>big)
				big=r;
			x=x/10;
		}
		return big;
	}

}
