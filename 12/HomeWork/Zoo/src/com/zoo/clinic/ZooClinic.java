package com.zoo.clinic;

import java.util.ArrayList;
import com.zoo.animal.Animal;

public class ZooClinic implements Clinic {

	private ArrayList<Animal> animals = new ArrayList<Animal>();

	@Override
	public void addAnimal(Animal anotherAnimals) {
		animals.add(anotherAnimals);
	}

	@Override
	public void healthAnimal() {
		for (var i : animals) {
			i.setHealth(100);
		}
	}

	@Override
	public void printHealth() {
		for (var i : animals) {
			System.out.println(i.getName() + " " + i.getHealth());
		}
	}

}