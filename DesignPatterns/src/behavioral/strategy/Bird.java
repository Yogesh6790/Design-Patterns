package behavioral.strategy;

public class Bird extends Animal{

	@Override
	protected String getName() {
		return this.getClass().getSimpleName();
	}
	
	public Bird(){
		flyType = new CanFly();
	}

	@Override
	protected String tryToFly() {
		return flyType.canItFly();
	}

}
