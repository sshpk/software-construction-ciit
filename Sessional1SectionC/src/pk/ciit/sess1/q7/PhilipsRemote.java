package pk.ciit.sess1.q7;

public class PhilipsRemote extends Remote{
	private int currentChannel;
	
	public PhilipsRemote() {
		implementor = new Philips();
	}

	@Override
	public void changeChannel(int channel) {
		currentChannel = channel;
		super.changeChannel(channel);
	}
	
	@Override
	public void nextChannel() {
		changeChannel(++currentChannel);
		
	}

	@Override
	public void prevChannel() {
		changeChannel(--currentChannel);
		
	}

}
