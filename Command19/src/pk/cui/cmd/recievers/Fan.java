package pk.cui.cmd.recievers;

public class Fan implements Device{
	public void start() {
		System.out.println("Fan Started..");
	}
	public void stop() {
		System.out.println("Fan stopped..");
	}
}
