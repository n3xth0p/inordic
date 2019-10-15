package com.zoo.animal;

public class Wolf extends Animal {

	public Wolf(int age, int weight, String name) {
		super(age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Волк " + this.name + " говорит ву-вууууу");
	}

	public void eat() {
		System.out.println("Волк " + this.name + " ест зайца");
	}

	public int countFood() {
		int foodVolume = this.weight / 8;
		return foodVolume;
	}
}
