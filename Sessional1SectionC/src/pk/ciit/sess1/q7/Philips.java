package pk.ciit.sess1.q7;

public class Philips implements TV{

	@Override
	public void on() {
		System.out.println("Philips tv on");
		
	}

	@Override
	public void off() {
		System.out.println("Philips tv off");
		
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("Philips tv change channel "+channel);
		
	}
	
}

