package com.zoo.animal;

public class Cat extends Animal {

	public Cat(String sex, int age, int weight, String name) {
		super(sex, age, weight, name);
	}

	public void say() {
		if (this.sex == "male") {
			System.out.println("Кот говорит- Мяу-мяу");
		} else if (this.sex == "female") {
			System.out.println("Кошка говорит- Мяу-мяу");
		} else {
			System.out.println("Мяу-мяу");
		}

	};

	public void eat() {
		if (this.sex == "male") {
			System.out.println("Кот " + this.name + " ест - чавк-чавк-чавк");
		} else if (this.sex == "female") {
			System.out.println("Кошка " + this.name + " ест - чавк-чавк-чавк");
		} else {
			System.out.println(this.name + " Мяу-мяу-чавк-чавк");
		}
	}

	public int countFood() {
		int foodVolume = this.weight / 10;
		return foodVolume;
	}

}
