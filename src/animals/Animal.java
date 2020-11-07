package animals;

import exceptions.AnimalIsDeadException;

public abstract class Animal {

	private boolean isDead;
	
	private int foodPoints;
	
	private String name;
	
	private int age;
	
	private int x, y;
	
	
	public abstract void live() throws AnimalIsDeadException; /** {
		/** If statements tutorial*
		if (!isDead) {
			if (foodPoints <= 0 || age > 100) {
				isDead = true;
				return;
			}
		} else {
			System.out.println(name + " is dead");
		}
		/******************
	}**/

	public void age(int years) {
		age+= years;
		System.out.println(name + " has aged up to " + age);
	}

	public void eat(int pts) {
		foodPoints+=pts;
	}
	
	
	public void move(int xDiff, int yDiff) {

		this.x += x;
		this.y += y;
		this.foodPoints --;
		System.out.println(name + " moved to " + x + ", " + y);
	}

	public void move() {
		move(1, 0);
	}

	public int getAge() {
		
		return age;
	}
	

	public boolean isDead() {
		return isDead;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getFoodPoints() {
		return foodPoints;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	/*public*/protected void setX(int x) {
		this.x = x;
	}
	
	/*public*/protected void setY(int y) {
		this.y = y;
	}

	public void eat(Animal other) {
		other.kill();
		eat(other.foodPoints);
		other.foodPoints = 0;
		System.out.println(name + " ate " + other.name + " and now " + other.name + " is dead and " + name + " has "+ foodPoints + " food");
	}
	
	public void playWithTwoOtherAnimals(Animal animal1, Animal animal2) {
		System.out.println( name + " is playing with " + animal1.name + " and " + animal2.name);
		this.move();
		animal1.move();
		animal2.move();
	}
	
	
	public void kill() {
		this.isDead = true;
		System.out.println("Killed " + name);
	}
	
	public Animal(boolean isDead, int age, String name, int foodPoints, int x, int y) {
		this.isDead = isDead;
		this.age = age;
		this.name = name;
		this.foodPoints = foodPoints;
		this.x = x;
		this.y = y;
	}
	
	public Animal(String name) {
		this(false, 0, name, 50, 0, 0);
	}
	
	/**inheritance**/
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.name.equals(((Animal)obj).name);
	}
	
	
	/**while loop**/
	public void liveUntilAge() {
		while (age < 10) {
			try {
				live();
			} catch (AnimalIsDeadException e) {
				break;
			}
		}
		kill();
	}
	
	/**abstract classes**/
	public static void makeAnimalsPlay(Animal animal1, Animal animal2, Animal animal3) {
		animal1.playWithTwoOtherAnimals(animal2, animal3);
	}
}
