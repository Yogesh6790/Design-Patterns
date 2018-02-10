package creational.abstractfactory;

/**
 * It works around super factory which creates other factories
 * Everything is encapsulated here, 
 * 		the method that orders objects.
 * 		factories that build object, 
 *      the final object, 
 * 		final object that contains object built using strategy pattern
 * We can use it when we have so many objects that can be added or changed dynamically.
 * 
 * Disadvantages
 *  Things can get complicated
 * 
 *
 */
public class Main {

	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		
		AbstractFactory factory = factoryProducer.getFactory("Shape Factory");
		
		Shape shape = factory.getShape("CIRCLE");
		shape.draw();
		
		shape = factory.getShape("RECTANGLE");
		shape.draw();
		
		factory = factoryProducer.getFactory("Color Factory");
		
		Color color = factory.getColor("RED");
		color.fill();
		
		color = factory.getColor("BLUE");
		color.fill();
		
	}

}
