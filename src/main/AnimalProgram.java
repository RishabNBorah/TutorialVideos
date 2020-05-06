package main;

import animals.Animal;
import animals.Chicken;
import animals.Dog;
import exceptions.AnimalIsDeadException;
import world.World;

public class AnimalProgram {

	public static void main(String[] args) {
		// do stuff to demonstrate animal methods but nothing permanent
		/**loops tutorial**/
		Dog fido = new Dog("Fido", 3);
		Chicken mack = new Chicken("Mack");
		Dog joe = new Dog("Joe", 7);
		//FlyingAnimal perry = new FlyingAnimal("Perry", 60);
		//Animal joseph = new Animal("Joseph");
		while (true) {
			if (fido.isDead() && mack.isDead() /*&& perry.isDead() && joseph.isDead()*/) {
				break;
			}
			try {
				fido.live();
				mack.live();
				//perry.live();
				//joseph.live();
			} catch (AnimalIsDeadException e) {
				e.printStackTrace();
			}
			if (Math.random() < 0.1) {
				Animal.makeAnimalsPlay(fido, mack, joe);
			}
			if (Math.random() < 0.1) {
				fido.eat(mack);
			}
			
		}
		/****/
		World world1 = new World();
		world1.run();
		
	}
}
