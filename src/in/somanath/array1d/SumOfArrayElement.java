package in.somanath.array1d;

public class SumOfArrayElement {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		sum(a);
	}

	private static void sum(int[] a) {

		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum Of Array Element is "+sum);
		
	}

}
