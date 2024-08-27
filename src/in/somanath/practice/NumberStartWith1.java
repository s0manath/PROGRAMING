package in.somanath.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, find out all the numbers starting with 1 using Stream functions?

public class NumberStartWith1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,11,123,124,120,345,346,347);
		List<String> collect = list.stream()
		.map(s->s+"")
		.filter(s->s.startsWith("1"))
		.collect(Collectors.toList());
		System.out.println(collect);
	}
}
