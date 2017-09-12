package com.god;

import com.live.Animal;
import com.live.Human;
import com.live.LivingThing;

// OO principal : " Open for extension & closed for modification"

public class God {

	// public void manageHuman(Human human) {
	// human.eat();
	// human.sleep();
	// human.study();
	// human.work();
	// }

	// public void manageAnimal(Animal animal) {
	// animal.eat();
	// animal.sleep();
	// animal.work();
	// }

	public void manageLT(LivingThing li) {
		li.eat();
		li.sleep();
		li.work();
	}

}
