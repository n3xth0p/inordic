package com.zoo;

import com.zoo.animal.*;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var Cat = new Cat(6, 10, "Барсик");
		Cat.say();
		System.out.println("Возраст " + Cat.getName() + " - " + Cat.getAge());
		Cat.eat();
		System.out.println("Объем еды " + Cat.getName() + ": " + Cat.countFood() + " кг");

		var Dog = new Dog(2, 10, "Тузик");
		Dog.say();
		System.out.println("Возраст " + Dog.getName() + " - " + Dog.getAge());
		Dog.eat();
		System.out.println("Объем еды " + Dog.getName() + ": " + Dog.countFood() + " кг");

		var Bear = new Bear(6, 200, "Миша");
		Bear.say();
		System.out.println("Возраст " + Bear.getName() + " - " + Bear.getAge());
		Bear.eat();
		System.out.println("Объем еды " + Bear.getName() + ": " + Bear.countFood() + " кг");

		var Cow = new Cow(6, 150, "Мурка");
		Cow.say();
		System.out.println("Возраст " + Cow.getName() + " - " + Cow.getAge());
		Cow.eat();
		System.out.println("Объем еды " + Cow.getName() + ": " + Cow.countFood() + " кг");

		var Horse = new Horse(3, 120, "Сивка Бурка");
		Horse.say();
		System.out.println("Возраст " + Horse.getName() + " - " + Horse.getAge());
		Horse.eat();
		System.out.println("Объем еды " + Horse.getName() + ": " + Horse.countFood() + " кг");

		var Monkey = new Monkey(3, 40, "Чичичи");
		Monkey.say();
		System.out.println("Возраст " + Monkey.getName() + " - " + Monkey.getAge());
		Monkey.eat();
		System.out.println("Объем еды " + Monkey.getName() + ": " + Monkey.countFood() + " кг");

		var Wolf = new Wolf(25, 120, "Акелла");
		Wolf.say();
		System.out.println("Возраст " + Wolf.getName() + " - " + Wolf.getAge());
		Wolf.eat();
		System.out.println("Объем еды " + Wolf.getName() + ": " + Wolf.countFood() + " кг");

	}

}
