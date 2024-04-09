package in.somanath.number;

import java.util.Scanner;

public class StrongNum {
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int x=s.nextInt();
			boolean e=strongNum(x);
			if(e)
				System.out.println("Strong Num");
			else
				System.out.println("not a StrongNum");
		}
	}

	private static boolean strongNum(int x) {
		
		int temp=x,sum=0;
		 while(x!=0) {
			 int r=x%10;
			 sum=sum+fact(r);
			 x =x/10;
		 }
		 if(temp==sum)
			 return true;
		 else {
			return false;
		}
	}

	private static int fact(int r) {
		// TODO Auto-generated method stub
		int prod=1;
		while(r>1) {
			prod=prod*r;
			r--;
		}
		return prod;
	}

}
