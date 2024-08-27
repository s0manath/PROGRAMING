package in.somanath.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenOddByPartition {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Map<Boolean, List<Integer>> collect = asList.stream().collect(Collectors.partitioningBy(x->x%2==0));
		
		System.out.println(collect.get(true));
		System.out.println(collect.get(false));

	}

}
