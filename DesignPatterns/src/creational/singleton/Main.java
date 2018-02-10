package creational.singleton;

/**
 * 
 * This pattern makes sure that only one object is created.
 * This class also provides a way to access this object without the need to instantiate it.
 *
 */
public class Main {

	public static void main(String[] args) {
		Singleton firstInstance = Singleton.getInstance();
		System.out.println(System.identityHashCode(firstInstance));
		
		Singleton secondInstance = Singleton.getInstance();
		System.out.println(System.identityHashCode(secondInstance));
	}

}
