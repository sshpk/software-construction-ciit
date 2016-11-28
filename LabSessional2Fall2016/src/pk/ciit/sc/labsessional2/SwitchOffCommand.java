package pk.ciit.sc.labsessional2;

public class SwitchOffCommand implements Command{
	HomeDevice device;
	public SwitchOffCommand(HomeDevice device) {
		this.device = device;
	}
	@Override
	public void execute() {
		device.switchOff();
	}

}
