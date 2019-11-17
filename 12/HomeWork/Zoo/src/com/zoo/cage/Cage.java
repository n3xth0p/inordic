package com.zoo.cage;

import com.zoo.animal.Animal;
import com.zoo.exceptions.CageIsFilledException;
import com.zoo.exceptions.NoAnimalsInCageException;

public class Cage {

	private String name;
	private boolean isEmpty;
	private Animal currentAnimal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cage(String name) {
		this.name = name;
		this.isEmpty = true;
		this.currentAnimal = null;
	}

	public void addAnimaltoCage(Animal animal) throws CageIsFilledException {
		if (this.isEmpty) {
			this.currentAnimal = animal;
			this.isEmpty = false;
			System.out.println("В вольер " + this.name + " добавлено животное - " + this.currentAnimal.getName());
		} else {
			throw new CageIsFilledException();
		}

	}

	public void removeAnimalFromCage() throws NoAnimalsInCageException {
		if (this.isEmpty) {
			throw new NoAnimalsInCageException();
		} else {
			System.out.println("Из вольера " + this.name + " убрано животное - " + this.currentAnimal.getName());
			this.currentAnimal = null;
			this.isEmpty = true;
		}
	}

}
