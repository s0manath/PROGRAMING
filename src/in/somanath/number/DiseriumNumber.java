package in.somanath.number;

import java.util.Scanner;

public class DiseriumNumber {
	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int x = s.nextInt();
			boolean e = diseriumNum(x);
			if (e)
				System.out.println(x+" is a Disarium Number");
			else
				System.out.println(x+" is not a Disarium Number");
		}
	}
	private static boolean diseriumNum(int x) {
		int dc = digitCount(x);
		int temp = x;
		int sum = 0;
		while (x != 0) {
			int rev = x % 10;
			sum = sum + pow(rev, dc);
			dc--;
			x = x / 10;
		}
		if (sum == temp)
			return true;
		else
			return false;
	}

	private static int digitCount(int x) {

		int count = 0;
		while (x != 0) {
			x = x / 10;
			count++;
		}
		return count;
	}

	private static int pow(int rev, int count) {

		if (count == 1)
			return rev;
		else
			return rev * pow(rev, count - 1);

	}
}
