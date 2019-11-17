package com.zoo.clinic;

import java.util.Random;
import java.util.ArrayList;
import com.zoo.animal.Animal;

public class GhostClinic implements Clinic {

	private ArrayList<Animal> animals = new ArrayList<Animal>();

	@Override
	public void addAnimal(Animal anotherAnimals) {
		boolean solution = new Random().nextBoolean();
		if (solution) {
			animals.add(anotherAnimals);
		}
	}

	@Override
	public void healthAnimal() {
		int health = new Random().nextInt(100);
		for (var i : animals) {
			i.setHealth(health);
		}
	}

	@Override
	public void printHealth() {
		for (var i : animals) {
			System.out.println(i.getName() + " " + i.getHealth());
		}

	}

}
