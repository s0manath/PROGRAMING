package in.somanath.number;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int x=s.nextInt();
			String st=DeciToBin(x);
			System.out.println(st);
		}
	}

	private static String DeciToBin(int x) {
		
		String s="";
		while(x!=0) {
			int r=x%2;
			s=r+s;
			x=x/2;
		}
		
		return s;
	}

}
