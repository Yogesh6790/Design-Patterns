package creational.factory;

/**
 * 
 * Objects are created without exposing the creation logic to the client.
 * It is used when we don't know ahead of time what class object we needed,
 * It is decided at run-time.
 * 
 * Advantages
 *  Creation logic is not exposed
 * Disadvantages
 *  Extra(Factory) class to instantiate object
 *
 */
public class Main {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.getShape("CIRCLE");
		shape.draw();
		
		shape = factory.getShape("RECTANGLE");
		shape.draw();

	}

}
