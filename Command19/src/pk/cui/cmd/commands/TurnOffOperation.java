package pk.cui.cmd.commands;

import pk.cui.cmd.recievers.Device;

public class TurnOffOperation implements Operation{
	Device device;
	public TurnOffOperation(Device device){
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
