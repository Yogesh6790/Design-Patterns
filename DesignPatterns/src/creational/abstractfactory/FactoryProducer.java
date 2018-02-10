package creational.abstractfactory;

public class FactoryProducer {
	
	public AbstractFactory getFactory(String name){
		return name.equals("Shape Factory") ?  new ShapeFactory() : new ColorFactory();
	}

}
