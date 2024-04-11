package in.somanath.array1d;

public class MergeTwoSortedArrayInToASortedArray {
	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 45, 56, 76 };
		int[] b = { 15, 22, 25, 34, 35, 38 };

		mergeTwoArray(a, b);
	}
	private static void mergeTwoArray(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			} else {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		while (i < a.length) {
			c[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			c[k] = b[j];
			k++;
			j++;
		}
		for (int l = 0; l < c.length; l++) {
			System.out.print(c[l] + " ");
		}

	}

}
