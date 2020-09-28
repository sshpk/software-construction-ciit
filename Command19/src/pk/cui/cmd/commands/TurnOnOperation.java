package pk.cui.cmd.commands;

import pk.cui.cmd.recievers.Device;

public class TurnOnOperation implements Operation{
	Device device;
	public TurnOnOperation(Device device){
		this.device=device;
	}
	@Override
	public void execute() {
		device.start();

	}
	@Override
	public void undo() {
		device.stop();
		
	}


}
