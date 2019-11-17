package com.zoo.animal;

public class Cat extends Animal {
	private String name;
	private int age;
	private int weight;
	private int health;
	
	public Cat(int age, int weight, int health, String name) {
		super(age, weight, health, name);
	}

	public void say() {
		System.out.println("Кот " + this.name + " говорит - Мяу-мяу");
	};

	public void eat() {
		System.out.println("Кот " + this.name + " ест мышку");
	}

	public int countFood() {
		int foodVolume = this.weight / 10;
		return foodVolume;
	}

}
