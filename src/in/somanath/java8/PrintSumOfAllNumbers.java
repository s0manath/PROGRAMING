package in.somanath.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PrintSumOfAllNumbers {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,4,5,6,7);
		
		Optional<Integer> sum = asList.stream().reduce((a,b)-> a+b);
		
		System.out.println("sum of number :"+ sum.get());
	}
}
