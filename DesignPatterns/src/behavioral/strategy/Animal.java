package behavioral.strategy;

public abstract class Animal {
	
	protected abstract String getName();
	
	protected abstract String tryToFly();
	
	protected Flys flyType;
	
	public void changeFlyType(Flys flys){
		flyType = flys;
	}

}
