package animals;

public class FlyingAnimal extends Animal {

	private int maxHeight;
	
	public FlyingAnimal(String name, int maxHeight) {
		super(name);
		this.maxHeight = maxHeight;
		
		System.out.println(getAge() + " " + getName());
	}

	public void fly() {
		System.out.println(getName() + " is flying at " + maxHeight + " feet");
	}
	
	public void move() {
		fly();
		super.move();
	}
	
}
