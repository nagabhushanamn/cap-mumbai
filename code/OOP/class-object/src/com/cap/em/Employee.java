package com.cap.em;

public class Employee {

	// a. state

	// 1. class state
	public static String tnrName;

	// 2. object state
	public int id;
	public String name;
	private double salary;

	// b. constructor

	// c. behavior

	// 1. class behav
	public static void doTeach() {
		System.out.println("Employee.doTeach() by "+tnrName);
	}

	// 2. object behav
	public void doListen() {
		System.out.println("emp.doListen() by "+name);
	}

}
