package creational.abstractfactory;

public class ColorFactory extends AbstractFactory{
	
	public Color getColor(String name){
		return name.equals("RED") ? new Red() : new Blue();
	}

	@Override
	public Shape getShape(String name) {
		return null;
	}

}
