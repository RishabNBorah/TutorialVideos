package animals;

import exceptions.AnimalIsDeadException;

public abstract class FlyingAnimal extends Animal {

	private int wingspan;
	
	public FlyingAnimal(String name, int wingspan) {
		super(name);
		this.wingspan = wingspan;
		System.out.println("Created new flying animal named " +name);
	}
	
	public int getWingspan() {
		return wingspan;
	}
	
	public void move() {
		this.move(0, wingspan);
	}

	public abstract void fly();/* {
		this.move();
	}*/
	
	/*@Override
	public void live() throws AnimalIsDeadException {
		fly();
		//super.live();
	}*/
	
	/**if statements**/
	@Override
	public void eat(Animal other) {
		if (!(other instanceof Dog)) {
			super.eat(other);
		}
	}
	
	/**if statements **/
	private int maxHeight;
	
	/*redefine FlyingAnimal constructor to include maxHeight*/
	
	public int getMaxHeight() {
		return maxHeight;
	}
	

	/**if statements tutorial**/
	@Override
	public void move(int xDiff, int yDiff) {
		super.move(xDiff, yDiff);
		if (this.getY() > maxHeight) {
			this.setY(maxHeight);
		}
	}
	
}
