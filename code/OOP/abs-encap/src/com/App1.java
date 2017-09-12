package com;

import com.emp.Employee;

public class App1 {

	public static void main(String[] args) {

		Employee employee1 = new Employee(12, "Nag", 1000.00);
		System.out.println(employee1);

		// employee1.id=-1;
		// employee1.bonus=100000.00;

		employee1.setSalary(2000.00);

		System.out.println(employee1);

	}

}
