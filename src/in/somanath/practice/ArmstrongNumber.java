package in.somanath.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		boolean e=isArmstrong(n);
		
		if(e) {
			System.out.println(e);
		}
		else {
			System.out.println(e);
		}
	}

	private static boolean isArmstrong(int n) {
		
		int temp=n;
		int sum=0;
		int count=countNum(n);
		
		while(n!=0) {
			int rev=n%10;
			sum=sum+pow(rev,count);
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}

	private static int pow(int rev, int count) {
		int prod=1;
		while(count!=0) {
			prod=prod*rev;
			count--;
		}
		return prod;
	}

	private static int countNum(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
		
		
	}
}
