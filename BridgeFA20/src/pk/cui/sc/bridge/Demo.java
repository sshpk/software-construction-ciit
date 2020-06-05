package pk.cui.sc.bridge;

import pk.cui.sc.bridge.devices.Device;
import pk.cui.sc.bridge.devices.Radio;
import pk.cui.sc.bridge.devices.Tv;
import pk.cui.sc.bridge.remotes.AdvancedRemote;
import pk.cui.sc.bridge.remotes.BasicRemote;

public class Demo {
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.togglePower();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.togglePower();
		advancedRemote.mute();
		device.printStatus();
	}
}
