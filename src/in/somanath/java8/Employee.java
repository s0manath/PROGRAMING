package in.somanath.java8;

public class Employee {

	public int id;
	
	
	public int salary;

	public Employee(int id,int salary) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
