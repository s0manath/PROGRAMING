package in.somanath.array1d;

public class Reverse {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40};
		
		int i=0,j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for (int l = 0; l < a.length; l++) {
			System.out.print(a[l] + " ");
		}
	}
}
