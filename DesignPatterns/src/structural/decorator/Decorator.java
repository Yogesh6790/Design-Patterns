package structural.decorator;

public abstract class Decorator implements Shape {
	
	private Shape decoratedShape;
	
	Decorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
