package behavioral.observer;

public class HexaDecimalObserver implements Observer {

	@Override
	public void update(int state) {
		System.out.println(this.getClass().getSimpleName() + " : "
				+ Integer.toHexString(state));
	}

}
