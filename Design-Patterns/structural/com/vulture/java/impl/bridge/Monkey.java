package com.vulture.java.impl.bridge;

public class Monkey extends Animal{

	protected Monkey(Feeding feeding) {
		super(feeding);
	}

	@Override
	public void eat() {
		 feeding.peelFood();
		 feeding.eat();		
	}

}
