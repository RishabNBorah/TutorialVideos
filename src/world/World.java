package world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import animals.Animal;
import animals.Cat;
import animals.Chicken;
import animals.Dog;
import exceptions.AnimalIsDeadException;

public class World {

	//private Animal[] animals;
	private List<Animal> animals;
	private Map<Animal, Double> chanceOfRandomInactivity; // chance animal does nothing
	
	public World() {
		//animals = new Animal[] {new Dog("Fido", 4), new Cat("Alec", "Bob")};
		animals = new ArrayList<Animal>();
		animals.add(new Dog("Fido", 4));
		animals.add(new Cat("Alec", "Bob"));
		animals.add(new Chicken("Carrie"));
		chanceOfRandomInactivity = new HashMap<>();
		chanceOfRandomInactivity.put(animals.get(0), 0.01);
		chanceOfRandomInactivity.put(animals.get(1), 0.5);
		chanceOfRandomInactivity.put(animals.get(2), 0.7);
	}
	
	public void run() {
		List<Animal> iterableList = new ArrayList<>(animals);
		for (Animal an : iterableList) {
			if (Math.random() < chanceOfRandomInactivity.get(an)) {
				continue;
			}
			try {
				an.live();
			} catch (AnimalIsDeadException e) {
				animals.remove(an);
			}
		}
	}

}
