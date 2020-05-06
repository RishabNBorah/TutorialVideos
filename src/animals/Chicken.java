package animals;

import exceptions.AnimalIsDeadException;

public class Chicken extends FlyingAnimal {

	public Chicken(String name) {
		super(name, 20);
	}
	
	@Override
	public void fly() {
		System.out.println("Chicken cannot fly");
	}
	
	/**Demonstrate that you cannot do super.super.move**/
	public void move() {
		// super.super.move()
		super.move(1,0);
	}
	
	/**abstract**/
	@Override
	public void live() throws AnimalIsDeadException {
		move();
	}

}
