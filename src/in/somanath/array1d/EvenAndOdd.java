package in.somanath.array1d;

public class EvenAndOdd {
	public static void main(String[] args) {
		int[] a= {10,11,23,34,35,46};
		
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				evencount++;
			else
				oddcount++;
		}
		System.out.println("Total even No "+evencount);
		System.out.println("Total odd No "+oddcount);

	}
	

}
