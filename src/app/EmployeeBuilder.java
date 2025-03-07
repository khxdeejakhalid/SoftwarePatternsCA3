package app;
public class EmployeeBuilder {
	private int id;
	private String pps;
	private String surname;
	private String firstName;
	private char gender;
	private String department;
	private double salary;
	private boolean fullTime;

	public EmployeeBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public EmployeeBuilder setPps(String pps) {
		this.pps = pps;
		return this;
	}

	public EmployeeBuilder setSurname(String surname) {
		this.surname = surname;
		return this;
	}

	public EmployeeBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public EmployeeBuilder setGender(char gender) {
		this.gender = gender;
		return this;
	}

	public EmployeeBuilder setDepartment(String department) {
		this.department = department;
		return this;
	}

	public EmployeeBuilder setSalary(double salary) {
		this.salary = salary;
		return this;
	}

	public EmployeeBuilder setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
		return this;
	}

	public Employee build() {
		return new Employee(id, pps, surname, firstName, gender, department, salary, fullTime);
	}
}