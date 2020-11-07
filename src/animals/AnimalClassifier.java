package animals;

import java.util.Random;

import exceptions.AnimalIsDeadException;

public class AnimalClassifier {

	public void mainLoop() {
		Animal one = new Chicken("One");
		Animal two = new WalkingAnimal("Two");
		Animal three = null;// new Animal("Three");
		while (!(one.isDead() && two.isDead() && three.isDead())) {
			try {
				one.live();
				two.live();
				three.live();
			} catch (AnimalIsDeadException e) {
				
			}
			Random random = new Random();
			Animal main = null;
			int choice = random.nextInt(3);
			if (choice == 0) {
				main = one;
			} else if (choice == 1) {
				main = two;
			} else {
				main = three;
			}
			
			int action = random.nextInt(4);
			if (action == 0) {
				main.move();
			} else if (action == 1) {
				main.eat(random.nextInt(5));
			} else {
				Animal other = null;
				choice = random.nextInt(2);
				if (main == one) {
					if (choice == 0) {
						if (two.isDead()) {
							continue;
						}
						other = two;
					} else {
						if (three.isDead()) {
							continue;
						}
						other = three;
					}
				} else if (main == two) {
					if (choice == 0) {
						if (one.isDead()) {
							continue;
						}
						other = one;
					} else {
						if (three.isDead()) {
							continue;
						}
						other = three;
					}
				} else {
					if (choice == 0) {
						if (one.isDead()) {
							continue;
						}
						other = one;
					} else {
						if (two.isDead()) {
							continue;
						}
						other = two;
					}
				}
				
				if (action == 2) {
					main.eat(other);
				} else {
					Animal other2 = null;
					if (main == one && other == two 
							|| other == one && main == two) {
						if (three.isDead()) {
							continue;
						}
						other2 = three;
					} else if (main == two && other == three || 
							main == three && other == two) {
						if (one.isDead()) {
							continue;
						}
						other2 = one;
					} else {
						if (two.isDead()) {
							continue;
						}
						other2 = two;
					}
					main.playWithTwoOtherAnimals(other, other2);
				}
			}
			
		}
	}
	
	public boolean isBaby(Animal animal) {
		if (animal.isDead()) {
			return false;
		} else {
			return animal.getAge() < 10;
		}
	}
	
	public boolean isChicken(Animal animal) {
		return animal instanceof Chicken;
	}
	
	
	public boolean isQuadrupedal(Animal animal) {
		if (animal instanceof WalkingAnimal) {
			return ((WalkingAnimal)animal).getNumLegs() == 4;
		} else {
			return false;
		}
	}
	public boolean canWalk(Animal animal) {
		return animal instanceof WalkingAnimal && ((WalkingAnimal)animal).getNumLegs() > 1;
	}
	
	public boolean canFly(Animal animal) {
		return animal instanceof FlyingAnimal && ((FlyingAnimal)animal).getWingspan() > 0;
	}
	
	public boolean canMove(Animal animal) {
		if (animal instanceof FlyingAnimal) {
			return canFly(animal);
		} else if (animal instanceof FlyingAnimal){
			return canWalk(animal);
		} else {
			return false;
		}
	}
}
