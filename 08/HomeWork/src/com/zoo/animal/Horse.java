package com.zoo.animal;

public class Horse extends Animal {

	public Horse(String sex, int age, int weight, String name) {
		super(sex, age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Конь " + this.name + " говорит иго-го-го-гоу");
	}

	public void eat() {
		System.out.println("Конь " + this.name + " ест хрхрхр");
	}

	public int countFood() {
		int foodVolume = this.weight / 3;
		return foodVolume;
	}
}
