package in.somanath.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		 String [] s= {"som","gir","fot"};
		 
//		 Arrays.sort(s);
//		 
//		 for (String string : s) {
//			 System.out.println(string);
//			
//		}
		 
		 //convert array to list
		 List<String> asList = Arrays.asList(s);
		 
		 List<String> list = Stream.of(s).sorted().collect(Collectors.toList());
		 System.out.println(list);
		 
		 List<String> List2 = asList.stream().sorted().collect(Collectors.toList());
		 System.out.println(List2);
		}
		 
		 
		
	
}
