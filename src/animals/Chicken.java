package animals;

public class Chicken extends FlyingAnimal {

	public Chicken(String name) {
		super(name, 0);
	}
	
	@Override
	public void fly() {
		System.out.println("Chicken cannot fly");
	}

}
