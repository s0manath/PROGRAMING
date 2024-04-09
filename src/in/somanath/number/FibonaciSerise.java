package in.somanath.number;

import java.util.Scanner;

public class FibonaciSerise {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter The Number");
			int x=s.nextInt();
			int first =0;
			int second=1;
			for(int i=1;i<=x;i++)
			{
				System.out.println(first+" ");
				int temp=first+second;
				first=second;
				second=temp;
			}
		}
	}

}
