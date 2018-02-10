package creational.abstractfactory;

public abstract class AbstractFactory {
	
	public abstract Shape getShape(String name);
	
	public abstract Color getColor(String name);

}
