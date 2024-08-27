package in.somanath.practice;
//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
import java.util.Arrays;
import java.util.List;

public class EvenJava8 {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5);
		
		asList.stream().filter(x->x%2==0).forEach(System.out::println);
	}
}
