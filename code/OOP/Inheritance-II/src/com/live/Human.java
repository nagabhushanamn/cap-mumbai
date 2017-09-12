package com.live;

// Human IS-A LivingThing

public class Human extends LivingThing  {

	public void study() {
		System.out.println("HUman study..");
	}
	
	@Override
	public void work() {
		System.out.println("Human Work..");
	}
	
}
