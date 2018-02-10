package creational.factory;

public class ShapeFactory {
	
	public Shape getShape(String name){
		return name.equals("CIRCLE")? new Circle() : new Rectangle();
	}

}
