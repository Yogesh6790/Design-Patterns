package behavioral.command;

/**
 * 
 * This is the invoker object
 *
 */
public class DeviceButton {
	
	private Command command;
	
	DeviceButton(Command command){
		this.command = command;
	}
	
	public void press(){
		command.execute();
	}
 
}
