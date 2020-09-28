package pk.cui.cmd.remote;

import pk.cui.cmd.commands.Operation;
import pk.cui.cmd.commands.TurnOffOperation;
import pk.cui.cmd.commands.TurnOnOperation;
import pk.cui.cmd.recievers.Device;

public class Remote {
	private Device device;
	private Operation lastOperation;
	public Remote(Device device){
		setDevice(device);
	}
	public void setDevice(Device device) {
		this.device=device;
		
	}
	public void pressOnButton(){
		lastOperation = new TurnOnOperation(device);
		lastOperation.execute();
	}
	public void pressOffButton(){
		lastOperation = new TurnOffOperation(device);
		lastOperation.execute();
	}
	public void pressUndoButton(){
		if(lastOperation==null)
			System.out.println("No command to undo");
		else
			lastOperation.undo();
	}
}
