package in.somanath.array1d;

public class BiggestAndSmallestElementInArray {

	public static void main(String[] args) {
		
		int a[]= {23,34,2334,33,12,233,456,1,345,7456};
		
		BiggestAndSmallest(a);
	}

	private static void BiggestAndSmallest(int[] a) {

		int big=a[0];
		int small=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>big) {
				big=a[i];
			}
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println(big);
		System.out.println(small);
		
	}
}
