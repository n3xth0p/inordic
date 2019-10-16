package com.zoo.animal;

public class Monkey extends Animal {
	private String name;
	private int age;
	private int weight;

	public Monkey(int age, int weight, String name) {
		super(age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Обезьяна " + this.name + " говорит У-у-у-у-уууууу");
	}

	public void eat() {
		System.out.println("Обезьяна " + this.name + " есть бабаны");
	}

	public int countFood() {
		int foodVolume = this.weight / 4;
		return foodVolume;
	}

}
