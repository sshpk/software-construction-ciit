package pk.ciit.sess1.q7;

public class Sony implements TV{

	@Override
	public void on() {
		System.out.println("Sony tv on");
		
	}

	@Override
	public void off() {
		System.out.println("Sony tv off");
		
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("Sony tv change channel "+channel);
		
	}
	
}
