package com.zoo.animal;

public class Bear extends Animal {

	public Bear(String sex, int age, int weight, String name) {
		super(sex, age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Медведь " + this.name + " говорит предевед медвед");
	}

	public void eat() {
		System.out.println("Медведь " + this.name + " ест чавк хрясь хрум");
	}

	public int countFood() {
		int foodVolume = this.weight / 2;
		return foodVolume;
	}
}
