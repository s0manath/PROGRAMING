package in.somanath.array1d;

public class MergeTwoArrayInZigZag {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 15, 25, 35, 45, 55 };

		mergeTwoArray(a, b);
	}

	private static void mergeTwoArray(int[] a, int[] b) {

		int c[] = new int[a.length + b.length];
		int i = 0, j = 0;
		while (i < a.length && i < b.length) {
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
			i++;
		}
		while (i < a.length) {
			c[j] = a[i];
			j++;
			i++;
		}
		while (i < b.length) {
			c[j] = b[i];
			j++;
			i++;
		}
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k]+" ");
		}
	}

}
