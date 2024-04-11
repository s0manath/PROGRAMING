package in.somanath.array1d;

public class ReverseAnArray {
	public static void main(String[] args) {

		int[] a = { 10, 65, 56, 40 };

		rev(a);
	}

	private static void rev(int[] a) {

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i] + " ");
		}

	}

}
