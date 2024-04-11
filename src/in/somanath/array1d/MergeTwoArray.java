package in.somanath.array1d;

public class MergeTwoArray {
	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {40,50,60};
		mergeTwoArray(a,b);
	}

	private static void mergeTwoArray(int[] a, int[] b) {
		
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int d:c) {
			System.out.print(d+" ");
		}
		
	}

}
