package behavioral.observer;

/**
 * 
 * It is a software design patterns in which subject sends updates to the its
 * list of observers when there is a chnage in it state.
 * 
 * Advantages
 * Loose Coupling(Subject doesn't need to know anything about observers)
 * 
 * Disadvantages
 * Subject may send irrelevant updates to its observers.
 *
 */
public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer binary = new BinaryObserver();
		Observer hexaDecimal = new HexaDecimalObserver();
		subject.attachObserver(binary);
		subject.attachObserver(hexaDecimal);
		int state = 10;
		System.out.println("Setting state : " + state);
		subject.setState(state);
		state = 15;
		System.out.println("Setting state : " + state);
		subject.setState(state);
	}

}
