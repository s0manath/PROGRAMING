package in.somanath.practice;

import java.util.Scanner;

public class Palendrom {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			
			boolean b=isPalendrom(n);
			if(b) {
				System.out.println("palendrom");
			}else {
				System.out.println("not a palendrom");
			}
		}
	}

	private static boolean isPalendrom(int n) {
		int temp=n;
		int rev=0;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		
		if(temp==rev) {
			return true;
		}else {
			return false;
		}
	}
}
