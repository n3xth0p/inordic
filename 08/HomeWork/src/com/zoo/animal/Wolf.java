package com.zoo.animal;

public class Wolf extends Animal {

	public Wolf(String sex, int age, int weight, String name) {
		super(sex, age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Волк " + this.name + " говорит ву-вууууу");
	}

	public void eat() {
		System.out.println("Волк " + this.name + " ест хрясь хрясь");
	}

	public int countFood() {
		int foodVolume = this.weight / 2;
		return foodVolume;
	}
}
