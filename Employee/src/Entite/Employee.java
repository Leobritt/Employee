package Entite;

public class Employee {
	
	private Integer id;
	
	private String name;
	
	private Double salary;
	
	public Employee() {
	}

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public double IncreasySalary(double percentage) {
		
		return salary += salary * percentage/100;
	}

	@Override
	public String toString() {
		return  "Employee name: "+ name + ", Id: " + id + ", New Salary: " + salary;
	}
	
}
