package in.somanath.array1d;

import java.util.Scanner;

public class ArrayDeclaration {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Size of the Array");
			int x=s.nextInt();
			int a[]=new int[x];
			System.out.println("Insert the value");
			for (int i=0;i<a.length;i++) {
				a[i]=s.nextInt();
			}
			for (int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}

		
	}
}
