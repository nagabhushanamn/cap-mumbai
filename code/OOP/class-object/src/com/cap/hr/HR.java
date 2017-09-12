package com.cap.hr;

import com.cap.em.Employee;

public class HR {

	public void manageEmployees() {

		Employee.tnrName = "Nag";

		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "A";

		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "B";

		Employee.doTeach();

		e1.doListen();
		e1.doListen();

	}

}
