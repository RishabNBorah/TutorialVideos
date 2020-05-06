package animals;

import exceptions.AnimalIsDeadException;
import interfaces.IPet;

/**
 * Loops
 * @author borah
 *
 */
public class Dog extends Animal implements IPet {
	
	public Dog(String name, /****/int circleCount) {
		super(name);
		this.circleCount = circleCount;
	}
	
	
	public void runInCircle() {
		this.move(1, 0);
		this.move(-1, 0);
		
	}
	
	public void sleep() {
		for (int i = 0; i < /*3*/ circleCount; i++) {
			this.runInCircle();
		}
		System.out.println(getName() + " is sleeping");
	}

	private int circleCount; //amend constructor
	
	@Override
	public void live() throws AnimalIsDeadException {
		if (this.isDead()) {
			throw new AnimalIsDeadException(this);
		}
		move();
		sleep();
	}


	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return getName()+"'s Owner";
	}
	
}
