package com.zoo.animal;

public class Cat extends Animal {

	public Cat(int age, int weight, String name) {
		super(age, weight, name);
	}

	public void say() {
		System.out.println("Кот " + this.name +  " говорит - Мяу-мяу");
	};

	public void eat() {
		System.out.println("Кот " + this.name + " ест мышку");
	}

	public int countFood() {
		int foodVolume = this.weight / 10;
		return foodVolume;
	}

}
