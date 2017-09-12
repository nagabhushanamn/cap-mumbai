package com.emp;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private double bonus;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonus = this.salary * 0.2;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSalary(double salary) {
		if (salary < 100000) {
			this.salary = salary;
			this.bonus = this.salary * 0.2;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}
