package behavioral.strategy;

public class CantFly implements Flys{

	@Override
	public String canItFly() {
		return "Can't fly";
	}

}
