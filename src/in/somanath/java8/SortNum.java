package in.somanath.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNum {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(7, 56, 89, 34, 12, 21);

		List<Integer> assending = list.stream().sorted().collect(Collectors.toList());

		List<Integer> decening = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());

		System.out.println(assending);
		System.out.println(decening);
	}
}
