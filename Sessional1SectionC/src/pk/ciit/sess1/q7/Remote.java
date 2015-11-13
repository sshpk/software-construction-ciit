package pk.ciit.sess1.q7;

abstract public class Remote {
	protected TV implementor;
	public void on() {
		implementor.on();
		
	}

	
	public void off() {
		implementor.off();
		
	}

	
	public void changeChannel(int channel) {
		implementor.changeChannel(channel);
		
	}
	
	abstract public void nextChannel();
	abstract public void prevChannel();
}
