package structural.decorator;

/**
 * 
 * This pattern is used when we want to modify/add function to the object 
 * dynamically without changing its structure
 * 
 *
 */
public class Main {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		circle.draw();
		redCircle.draw();
		redRectangle.draw();

	}

}
