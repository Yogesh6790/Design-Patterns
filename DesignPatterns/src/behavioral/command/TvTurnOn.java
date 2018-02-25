package behavioral.command;

/**
 * 
 * This is one of the command objects
 *
 */
public class TvTurnOn implements Command{
	
	private ElectronicDevice device;
	
	TvTurnOn(ElectronicDevice newDevice){
		device = newDevice;
	}

	@Override
	public void execute() {
		device.on();
	}

}
