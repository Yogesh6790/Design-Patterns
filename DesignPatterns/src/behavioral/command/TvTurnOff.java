package behavioral.command;

/**
 * 
 * This is one of the command objects
 *
 */
public class TvTurnOff implements Command{

	private ElectronicDevice device;
	
	TvTurnOff(ElectronicDevice newDevice){
		device = newDevice;
	}
	
	@Override
	public void execute() {
		device.off();
	}

}
