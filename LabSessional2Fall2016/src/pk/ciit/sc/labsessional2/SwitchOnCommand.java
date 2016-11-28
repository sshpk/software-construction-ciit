package pk.ciit.sc.labsessional2;

public class SwitchOnCommand implements Command {
	HomeDevice device;
	public SwitchOnCommand(HomeDevice device) {
		this.device = device;
	}
	@Override
	public void execute() {
		device.switchOn();
	}

}
