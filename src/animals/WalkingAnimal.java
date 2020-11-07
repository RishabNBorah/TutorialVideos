package animals;

import exceptions.AnimalIsDeadException;

public class WalkingAnimal extends Animal {

	private int numLegs;
	
	public WalkingAnimal(String name, int numLegs) {
		super(name);
		this.numLegs = numLegs;
	}
	
	public WalkingAnimal(String name) {
		this(name, 4);
	}
	
	
	public int getNumLegs() {
		return numLegs;
	}
	
	public void move() {
		move(numLegs, 0);
	}
	
	public void walk() {
		move();
		System.out.println(getName() + " is walking");
	}
	
	public void playWithTwoOtherAnimals(Animal other1, Animal other2) {
		this.walk();
		other1.move();
		other2.move();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " with " + numLegs + " legs";
	}

	@Override
	public void live() throws AnimalIsDeadException {
		// TODO Auto-generated method stub
		
	}

}
