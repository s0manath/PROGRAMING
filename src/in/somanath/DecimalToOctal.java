package in.somanath;

import java.util.Scanner;

public class DecimalToOctal {
	
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int x=s.nextInt();
			String se=deciToOctal(x);
			System.out.println(se);
		}
	}

	private static String deciToOctal(int x) {
		
		String s="";
		while(x!=0) {
			int r=x%8;
			s=r+s;
			x=x/8;
		}
		
		return s;
	}

}
