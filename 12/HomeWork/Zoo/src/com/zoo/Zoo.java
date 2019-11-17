package com.zoo;

import java.util.ArrayList;
import com.zoo.animal.*;
import com.zoo.cage.Cage;
import com.zoo.exceptions.CageIsFilledException;
import com.zoo.exceptions.NoAnimalsInCageException;
import com.zoo.exceptions.NoCageException;

public class Zoo {

	private String name;

	private ArrayList<Animal> animals = new ArrayList<Animal>();
	private ArrayList<Cage> zooCages = new ArrayList<Cage>();

	public Zoo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCage(Cage newCage) {
		this.zooCages.add(newCage);
		System.out.println("В зоопарк - " + this.getName() + " добавлен новый вольер " + newCage.getName());
	}

	public void addAnimals(Animal newAnimal) throws NoCageException {

		if (this.zooCages.size() > this.animals.size()) {
			this.animals.add(newAnimal);
			System.out.println("Добавлено животное - " + newAnimal.getName() + " свободных вольеров осталось - "
					+ (this.zooCages.size() - this.animals.size()));
		} else {
			throw new NoCageException();
		}
	}

	public static void main(String[] args) throws NoAnimalsInCageException, CageIsFilledException {
		// TODO Auto-generated method stub

		var MoscowZoo = new Zoo("Московский мини зоопарк");
		System.out.println(MoscowZoo.getName() + ", всего вольеров - " + MoscowZoo.zooCages.size() + ", всего животных "
				+ MoscowZoo.animals.size());

		var Barsik = new Cat(4, 10, 80, "кот Барсик");
		var Akella = new Wolf(5, 120, 100, "волк Акелла");
		var Pirat = new Dog(2, 25, 100, "пес Пират");
		var Umka = new Bear(10, 150, 60, "мишка Умка");

		try {
			MoscowZoo.addAnimals(Barsik);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		var Cage1 = new Cage("Зона 1");
		var Cage2 = new Cage("Зона 2");
		var Cage3 = new Cage("Зона 3");

		MoscowZoo.addCage(Cage1);
		MoscowZoo.addCage(Cage2);
		MoscowZoo.addCage(Cage3);

		try {
			// берем животное в зоопарк
			MoscowZoo.addAnimals(Barsik);
			// сажаем в выбранный вольер
			MoscowZoo.zooCages.get(0).addAnimaltoCage(Barsik);

			MoscowZoo.addAnimals(Akella);
			MoscowZoo.zooCages.get(1).addAnimaltoCage(Akella);

			MoscowZoo.addAnimals(Pirat);
			MoscowZoo.zooCages.get(2).addAnimaltoCage(Pirat);

			MoscowZoo.zooCages.get(2).addAnimaltoCage(Barsik);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			MoscowZoo.addAnimals(Umka);
		} catch (Exception e) {
			e.printStackTrace();
		}

		MoscowZoo.zooCages.get(0).removeAnimalFromCage();

		MoscowZoo.zooCages.get(0).addAnimaltoCage(Umka);
		;

	}

}
