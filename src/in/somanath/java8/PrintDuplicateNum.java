package in.somanath.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDuplicateNum {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 34, 4, 56, 67, 67, 2, 56, 34, 56, 68, 90, 87, 36);

		List<Integer> duplicateNum = list.stream().filter(e -> Collections.frequency(list, e) > 1).distinct()
				.collect(Collectors.toList());

		System.out.println(duplicateNum);
	}
}
