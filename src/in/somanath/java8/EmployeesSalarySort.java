package in.somanath.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesSalarySort{

	public static void main(String[] args) {
		
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		
		
		
		empList.add(new Employee(1,500));
		empList.add(new Employee(2,700));
		empList.add(new Employee(3,800));
		empList.add(new Employee(4,900));
		
		List<Employee> sortedEmp = empList.stream().sorted((a,b)->b.getSalary()-a.getSalary()).collect(Collectors.toList());
		System.out.println(sortedEmp);

		

		
	}
}
