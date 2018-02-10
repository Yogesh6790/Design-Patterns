package behavioral.observer;

public class BinaryObserver implements Observer {

	@Override
	public void update(int state) {
		System.out.println(this.getClass().getSimpleName() + " : "
				+ Integer.toBinaryString(state));
	}

}
	