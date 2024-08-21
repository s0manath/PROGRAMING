package in.somanath.array1d;

import java.util.HashSet;

public class UnionOfTwoArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,7,10};
		int b[]= {5,6,7,11,56,};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i:a) {
			set.add(i);
		}
		for(int i:b) {
			set.add(i);
		}
		System.out.println(set.toString());
	}

}
