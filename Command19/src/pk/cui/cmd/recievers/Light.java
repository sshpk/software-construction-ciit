package pk.cui.cmd.recievers;

public class Light implements Device{
	public void start() {
		System.out.println("Light is turned on..");
	}

	public void stop() {
		System.out.println("Light is turned off..");
	}
}
