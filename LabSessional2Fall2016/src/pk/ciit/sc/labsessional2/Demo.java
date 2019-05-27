package pk.ciit.sc.labsessional2;

public class Demo {

	public static void main(String[] args) {
		//Creating the receiver object
		HomeDevice light = new Light();
		
		//creating command and associating with receiver
		Command switchOnCommand = new SwitchOnCommand(light);
		
		//Creating invoker and associating with Command
		DeviceInvoker invoker = new DeviceInvoker(switchOnCommand);
		
		//perform action on invoker object
		invoker.execute();
		
		//do the same for other devices
		ElectricKettle kettle = new ElectricKettle();
		switchOnCommand = new SwitchOnCommand(kettle);
		invoker = new DeviceInvoker(switchOnCommand);
		invoker.execute();
		
		Juicer juicer = new Juicer();
		switchOnCommand = new SwitchOnCommand(juicer);
		invoker = new DeviceInvoker(switchOnCommand);
		invoker.execute();
		
		MicrowaveOven oven = new MicrowaveOven();
		switchOnCommand = new SwitchOnCommand(oven);
		invoker = new DeviceInvoker(switchOnCommand);
		invoker.execute();
		
		Stereo stereo = new Stereo();
		switchOnCommand = new SwitchOnCommand(stereo);
		invoker = new DeviceInvoker(switchOnCommand);
		invoker.execute();
		
		SwitchOffCommand switchOffCommand = new SwitchOffCommand(stereo);
		invoker = new DeviceInvoker(switchOffCommand);
		invoker.execute();
		
	}

}
