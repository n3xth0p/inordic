package com.zoo.animal;

public class Horse extends Animal {

	public Horse(int age, int weight, String name) {
		super(age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Конь " + this.name + " говорит иго-го-го-гоу");
	}

	public void eat() {
		System.out.println("Конь " + this.name + " ест овес");
	}

	public int countFood() {
		int foodVolume = this.weight / 10;
		return foodVolume;
	}
}
