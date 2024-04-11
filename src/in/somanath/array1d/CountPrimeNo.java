package in.somanath.array1d;

public class CountPrimeNo {
	public static void main(String[] args) {
		int a[]= {1,3,5,10,56,17,45};
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			boolean b=primeNo(a[i]);
			if(b)
				count++;
		}
		System.out.println("Total Prime No Present:"+count);
	}

	private static boolean primeNo(int k) {
		if(k==1)
		  return false;
	     for(int i=2;i<=k/2;i++) {
	    	 if(k%i==0) {
	    		 return false;
	    	 }
	     }
		return true;
	}

}
