package com.zoo.animal;

public abstract class Animal {

	protected String name;
	protected int age;
	protected int weight;

	public Animal(int age, int weight, String name) {
		this.age = age;
		this.weight = weight;
		this.name = name;
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

	public abstract void say();

	public abstract void eat();

	public abstract int countFood();

}
