package exceptions;

import animals.Animal;

public class AnimalIsDeadException extends Exception {

	private Animal animal;

	public AnimalIsDeadException(Animal animal) {
		super(animal.getName() + " is dead");
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}

}
