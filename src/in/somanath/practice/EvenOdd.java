package in.somanath.practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int n = scanner.nextInt();
			
			if(n%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
	}
}
