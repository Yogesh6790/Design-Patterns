package creational.prototype;

/**
 * 
 * Creating new objects by cloning other objects.
 * This pattern is used when creation of the object directly is costly.
 * 
 * For example, an object is to be created after a costly database operation.
 * We can cache the object, returns its clone on next request.
 * 
 *
 */
public class Main {

	public static void main(String[] args) {
		CloneFactory cloneFactory = new CloneFactory();
		Sheep sheepObj = new Sheep();
		Sheep clonedObject = (Sheep)cloneFactory.getClone(sheepObj);
		sheepObj.setType("Normal");
		System.out.println(sheepObj);
		System.out.println(clonedObject);
		System.out.println(sheepObj.getType());
		System.out.println(clonedObject.getType());
		System.out.println(sheepObj.hashCode());
		System.out.println(clonedObject.hashCode());		
	}

}
