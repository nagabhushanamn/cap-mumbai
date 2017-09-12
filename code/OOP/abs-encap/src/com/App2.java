package com;

import com.car.Car;
import com.wheel.CEATWheel;
import com.wheel.MRFWheel;

public class App2 {

	public static void main(String[] args) {

		Car car = new Car();
		MRFWheel mrfWheel = new MRFWheel();
		CEATWheel ceatWheel = new CEATWheel();

		// car.setWheel(mrfWheel);
		car.setWheel(ceatWheel);

		car.move();
	}

}
