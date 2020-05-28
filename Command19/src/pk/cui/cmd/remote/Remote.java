package pk.cui.cmd.remote;

import pk.cui.cmd.commands.Command;
import pk.cui.cmd.commands.TurnOffCommand;
import pk.cui.cmd.commands.TurnOnCommand;
import pk.cui.cmd.recievers.Device;

public class Remote {
	private Device device;
	private Command lastCommand;
	public Remote(Device device){
		setDevice(device);
	}
	public void setDevice(Device device) {
		this.device=device;
		
	}
	public void pressOnButton(){
		lastCommand = new TurnOnCommand(device);
		lastCommand.execute();
	}
	public void pressOffButton(){
		lastCommand = new TurnOffCommand(device);
		lastCommand.execute();
	}
	public void pressUndoButton(){
		if(lastCommand==null)
			System.out.println("No command to undo");
		else
			lastCommand.undo();
	}
}
