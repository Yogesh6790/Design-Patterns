package behavioral.command;

/**
 * 
 * A request is wrapped under an object as command and passed to invoker object. 
 * Invoker object looks for the appropriate object which can handle this command 
 * and passes the command to the corresponding object which executes the command.
 * 
 * 
 * Advantages
 * 1. Allows us to set aside a list of commands for later use
 * 2. We can store a list of commands for a leter use.
 * 
 * Disadvantages
 * We tend to create many small classes for a list of commands
 *
 */
public class Main {
	

	public static void main(String[] args) {
		
		ElectronicDevice device = new Telivision(); //Receiver
		
		Command command = new TvTurnOn(device); //Command
		
		DeviceButton button = new DeviceButton(command); //invoker
		
		button.press();
		
		//--------------------------------------------
		
		command = new TvTurnOff(device);
		
		button = new DeviceButton(command);
		
		button.press();
	}

}
