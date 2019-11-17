package com.zoo.animal;

public class Dog extends Animal {
	private String name;
	private int age;
	private int weight;
	private int health;

	public Dog(int age, int weight, int health, String name) {
		super(age, weight, health, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Пес " + this.name + " лает гав гав гав");
	}

	public void eat() {
		System.out.println("Пес " + this.name + " ест косточку");
	}

	public int countFood() {
		int foodVolume = this.weight / 5;
		return foodVolume;
	}

}
