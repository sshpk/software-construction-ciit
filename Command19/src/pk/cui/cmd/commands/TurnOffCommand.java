package pk.cui.cmd.commands;

import pk.cui.cmd.recievers.Device;

public class TurnOffCommand implements Command{
	Device device;
	public TurnOffCommand(Device device){
		this.device=device;
	}
	@Override
	public void execute() {
		device.stop();

	}
	@Override
	public void undo() {
		device.start();
		
	}
}
