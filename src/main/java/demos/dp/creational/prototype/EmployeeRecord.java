package demos.dp.creational.prototype;

public class EmployeeRecord implements Cloneable {

	private long id;
	private String name;
	private double salary;
	private String role;

	public EmployeeRecord(long id, String name, double salary, String role) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "EmployeeRecord [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
	}

	@Override
	public EmployeeRecord clone() throws CloneNotSupportedException {
		System.out.println("Cloning EmployeeRecord object...");
		return (EmployeeRecord) super.clone();
	}

}
