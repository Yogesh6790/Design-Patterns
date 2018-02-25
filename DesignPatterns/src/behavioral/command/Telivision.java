package behavioral.command;

/**
 * 
 * This is the receiver object
 *
 */
public class Telivision implements ElectronicDevice{

	@Override
	public void on() {
		System.out.println("Telivision is On now");
	}

	@Override
	public void off() {
		System.out.println("Telivision is Off now");
	}

}
