package in.somanath;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			int x=s.nextInt();
			if(x==1)
				System.out.println("not a prime number");
			else {
			int g=prime(x,x/2);
			if(g==1)
				System.out.println("prime");
			else
				System.out.println("not prime");
			}
		}
	}

	private static int prime(int num,int i) {
		
		if(i==1) {
			return 1;
		}
		if(num%i==0) {
			return 0;
		}
		return prime(num,i-1);
		
	}

}
