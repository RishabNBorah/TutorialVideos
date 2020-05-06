package animals;

import exceptions.AnimalIsDeadException;
import interfaces.IPet;

public class Cat extends Animal implements IPet {

	private String owner;
	private int lives;
	public static final int CAT_LIVES = 9;
	
	public Cat(String name, String ownerName, int lives) {
		super(name);
		this.owner = ownerName;
	}
	

	public Cat(String name, String ownerName) {
		this(name, ownerName, CAT_LIVES);
	}

	@Override
	public void live() throws AnimalIsDeadException {
		if (isDead()) {
			throw new AnimalIsDeadException(this);
		}
		move(1, 0);
	}
	
	@Override
	public void kill() {
		if (lives > 0) { 
			lives--;
		} else {
			super.kill();
		}
	}

	@Override
	public String getOwner() {
		
		return owner;
	}

}
