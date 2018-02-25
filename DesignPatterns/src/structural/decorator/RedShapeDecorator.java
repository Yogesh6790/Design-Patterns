package structural.decorator;

public class RedShapeDecorator extends Decorator{

	RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw(){
		super.draw();
		setColor();
	}

	private void setColor() {
		System.out.println("Color : Red");
	}

}
