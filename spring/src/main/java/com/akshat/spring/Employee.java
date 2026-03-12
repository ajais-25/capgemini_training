package com.akshat.spring;

public class Employee {

	private int id;
	private String name;
	private String email;
	private double salary;
	
	private Student student1;
	
	public Employee() {
		super();
		System.out.println("Employee constructor called");
	}

	public Employee(int id, String name, String email, double salary, Student student1) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.student1 = student1;
		
		System.out.println("All args constructor of Employee");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Student getStudent1() {
		return student1;
	}

	public void setStudent1(Student student1) {
		this.student1 = student1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", student="
				+ student1 + "]";
	}
}
