package com.zoo.animal;

public class Cow extends Animal {
	private String name;
	private int age;
	private int weight;
	private int health;

	public Cow(int age, int weight, int health, String name) {
		super(age, weight, health, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Корова " + this.name + " мычит мумуууууу");
	}

	public void eat() {
		System.out.println("Корова " + this.name + " ест травку муравку");
	}

	public int countFood() {
		int foodVolume = this.weight / 8;
		return foodVolume;
	}

}
