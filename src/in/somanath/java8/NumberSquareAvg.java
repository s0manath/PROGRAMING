package in.somanath.java8;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAvg {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);

	    double collect = list.stream().map(a->a*a).filter(a->a<300).mapToInt(a->a).average().getAsDouble();
	    System.out.println(collect);
	}

}
