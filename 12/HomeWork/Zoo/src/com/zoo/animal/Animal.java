package com.zoo.animal;

public abstract class Animal {

	private String name;
	private int age;
	private int weight;
	private int health;

	public Animal(int age, int weight, int health ,String name) {
		this.age = age;
		this.weight = weight;
		this.name = name;
		this.health = health;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
		
	public abstract void say();

	public abstract void eat();

	public abstract int countFood();

}
