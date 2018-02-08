package behavioral.strategy;

public class Main {
	/*
	 * Class Behavior or algorithm can be changed at run time
	 * 
	 * Advantages
	 * 1. Object Composition advantages.
	 * 2. Reduces boiler plate code, conditions
	 * 
	 *	Disadvantages
	 * 1. Lots of classes and Objects
	 */

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println("Dog: "+dog.tryToFly());
		System.out.println("Cat: "+bird.tryToFly());
		
		dog.changeFlyType(new CanFly());
		
		System.out.println("Dog: "+dog.tryToFly());
	}

}
