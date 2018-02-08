package behavioral.strategy;

public class Dog extends Animal{

	@Override
	protected String getName() {
		return this.getClass().getSimpleName();
	}
	
	public Dog(){
		flyType = new CantFly();
	}
	
	@Override
	protected String tryToFly() {
		return flyType.canItFly();
	}

}
