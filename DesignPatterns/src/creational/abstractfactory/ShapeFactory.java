package creational.abstractfactory;


public class ShapeFactory extends AbstractFactory{
	
	public Shape getShape(String name){
		return name.equals("CIRCLE")? new Circle() : new Rectangle();
	}

	@Override
	public Color getColor(String name) {
		return null;
	}

}
