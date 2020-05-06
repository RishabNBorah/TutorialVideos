package animals;



public class Animal {

	private boolean isDead;
	
	private int foodPoints;
	
	private String name;
	
	private int age;
	
	
	public Animal(boolean isDead, int age, String name, int foodPoints) {
		this.isDead = isDead;
		this.age = age;
		this.name = name;
		this.foodPoints = foodPoints;
	}
	
	public Animal(String name) {
		this(false, 0, name, 50);
	}
	
	public void move() {
		System.out.println(name + " is moving... ");
		foodPoints --;
		System.out.println(name + " has " + foodPoints + " food left");
	}
	
	public void age(int numYears) {
		age+= numYears;
		System.out.println(name + " has aged up to " + age);
	}
	
	public void age() {
		age(1);
	}
	
	public void playWithTwoOtherAnimals(Animal animal1, Animal animal2) {
		System.out.println( name + " is playing with " + animal1.name + " and " + animal2.name);
		this.move();
		animal1.move();
		animal2.move();
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void eat(Animal other) {
		other.kill();
		this.foodPoints += other.foodPoints;
		other.foodPoints = 0;
		System.out.println(name + " ate " + other.name + " and now " + other.name + " is dead and " + name + " has "+ foodPoints + " food");
	}
	
	public void eat(int pts) {
		foodPoints+=pts;
	}
	
	public void kill() {
		this.isDead = true;
		System.out.println("Killed " + name);
	}
	
	public boolean isDead() {
		return isDead;
	}
	
	
	public String getName() {
		return name;
	}
	
}
