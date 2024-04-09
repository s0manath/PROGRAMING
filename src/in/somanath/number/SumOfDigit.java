package in.somanath.number;

import java.util.Scanner;

//using recursion

public class SumOfDigit {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number");

			int x = s.nextInt();

			x = sum(x);
			System.out.println(x);
		} 

	}

	static int sum(int x) {
		if (x < 10)
			return x;
		else
			return (x % 10) + sum(x / 10);
	}

}
