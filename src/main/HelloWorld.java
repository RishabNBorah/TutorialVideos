package main;

import animals.Animal;
import animals.Chicken;
import animals.FlyingAnimal;

public class HelloWorld {

	public static void main(String[] args) {
		Chicken bob = new Chicken("Bob");
		Animal bobby = new FlyingAnimal("Bobby", 100);
		((FlyingAnimal)bobby).fly();
		Animal beelzebub = new Animal("Beelzebub");
		bob.playWithTwoOtherAnimals(bobby, beelzebub);
		//bob.fly();
		//bob.move();
		/*
		 * System.out.print("Type your number: ");
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.print("Type your second number: ");
		int num2 = scan.nextInt();
		System.out.println("The sum of these integers is " + (num1 + num2));
		scan.close();
		*/
	}
}
