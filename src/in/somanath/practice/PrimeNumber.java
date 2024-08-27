package in.somanath.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Give the Input");
			
			int n = scanner.nextInt();
			int count=0;
			for(int i=2;i<=n/2;i++) {
				
				if(n%i==0) {
					
					count++;
				}
			}
			if(count>0) {
				System.out.println("not aprime");
			}
			else {
				System.out.println("prime");
			}
		}
		
	}
}
