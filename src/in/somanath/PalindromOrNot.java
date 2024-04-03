package in.somanath;

import java.util.Scanner;

public class PalindromOrNot {
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			int x=s.nextInt();
			 boolean e=palindrom(x);
			 if(e)
				 System.out.println("palendrom");
			 else
			 System.out.println("not a palindrom");
		}
	}

	private static  boolean palindrom(int x) {
		
		if(x<10)
			return false;
		int temp=x;
		int rev=0;
		  while(x!=0) {
			  int r=x%10;
			  rev=rev*10+r;
			  x=x/10;
		  }
		
		
		if(temp==rev)
			return true;
		else 
			return false;
	}

}
