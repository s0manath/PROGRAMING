package in.somanath.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(22,234,45,56,257);
		
		List<Integer> numWith2 = list.stream()
			.map(e->""+e)
			.filter(e->e.startsWith("2"))
			.map(e->Integer.parseInt(e))
			.collect(Collectors.toList());
		System.out.println(numWith2);
	}
}
