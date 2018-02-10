package behavioral.observer;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer binary = new BinaryObserver();
		Observer hexaDecimal = new HexaDecimalObserver();
		subject.attachObserver(binary);
		subject.attachObserver(hexaDecimal);
		int state = 10;
		System.out.println("Setting state : "+state);
		subject.setState(state);
		state = 15;
		System.out.println("Setting state : "+state);
		subject.setState(state);
	}

}
