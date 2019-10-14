package com.zoo.animal;

public class Cow extends Animal {

	public Cow(String sex, int age, int weight, String name) {
		super(sex, age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Корова " + this.name + " мычит мумуууууу");
	}

	public void eat() {
		System.out.println("Корова " + this.name + " ест чавк чавк чавк");
	}

	public int countFood() {
		int foodVolume = this.weight / 5;
		return foodVolume;
	}

}
