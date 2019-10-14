package com.zoo.animal;

public class Dog extends Animal {

	public Dog(String sex, int age, int weight, String name) {
		super(sex, age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Пес " + this.name + " лает гав гав гав");
	}

	public void eat() {
		System.out.println("Пес " + this.name + " ест чавк чавк чавк");
	}

	public int countFood() {
		int foodVolume = this.weight / 5;
		return foodVolume;
	}

}
