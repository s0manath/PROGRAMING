package in.somanath.java8;

import java.util.Arrays;
import java.util.List;

public class SkipAndLimit {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Integer firstFiveNumSum = list.stream().limit(5).reduce((p,q)->p+q).get();
		System.out.println(firstFiveNumSum);
		Integer lastFiveNumSum = list.stream().skip(5).reduce((p,q)->p+q).get();
		System.out.println(lastFiveNumSum);
	}
}
