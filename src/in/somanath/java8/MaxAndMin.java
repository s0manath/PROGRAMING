package in.somanath.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		Integer maxnum = list.stream().max(Integer::compare).get();
		System.out.println(maxnum);
		Integer minnum = list.stream().min(Integer::compare).get();
		System.out.println(minnum);
	} 
}
