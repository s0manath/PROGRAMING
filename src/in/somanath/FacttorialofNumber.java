package in.somanath;

import java.util.Scanner;

public class FacttorialofNumber {
	
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int x=s.nextInt();
			x=factOfDigit(x);
			System.out.println(x);
		}
	}
	static int factOfDigit(int x) {
		
		if(x==1) {
			return 1;
		}else {
			return x*factOfDigit(x-1);
		}
	}

}
