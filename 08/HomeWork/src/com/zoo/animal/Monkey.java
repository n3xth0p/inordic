package com.zoo.animal;

public class Monkey extends Animal {

	public Monkey(String sex, int age, int weight, String name) {
		super(sex, age, weight, name);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		System.out.println("Обезьяна говорит У-у-у-у-уууууу");
	}

	public void eat() {
		System.out.println("Обезьяна есть уууууу хрум хрум");
	}

	public int countFood() {
		int foodVolume = this.weight / 4;
		return foodVolume;
	}

}
