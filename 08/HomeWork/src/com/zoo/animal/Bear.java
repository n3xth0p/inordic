package com.zoo.animal;

public class Bear extends Animal {

	public Bear(int age, int weight, String name) {
		super(age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Медведь " + this.name + " говорит предевед медвед");
	}

	public void eat() {
		System.out.println("Медведь " + this.name + " ест мед");
	}

	public int countFood() {
		int foodVolume = this.weight / 10;
		return foodVolume;
	}
}
