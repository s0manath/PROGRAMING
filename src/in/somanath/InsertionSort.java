package in.somanath;

public class InsertionSort {
	public static void main(String[] args) {
		
		int []a= {12,8,6,7,3,18,17};
		int [] b=sort(a);
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	}

	public static  int[] sort(int[] a) {
		
		int temp,j;
		for(int i=1;i<a.length;i++) {
			temp=a[i];
			j=i;
			
			while(j>0&&a[j-1]>temp) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		return a;
	}
	//best case time complexity O(n)
	//worst case time complexity O(n^2)

}
