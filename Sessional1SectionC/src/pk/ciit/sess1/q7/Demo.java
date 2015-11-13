package pk.ciit.sess1.q7;

public class Demo {

	public static void main(String[] args) {
//		TV philips = new Philips();
//		philips.on();
//		philips.off();
//		philips.changeChannel(34);
//		
//		TV sony = new Sony();
//		sony.on();
//		sony.off();
//		sony.changeChannel(34);
		
		Remote remote = new PhilipsRemote();
		remote.on();
		remote.off();
		remote.changeChannel(32);
		remote.nextChannel();
		remote.prevChannel();

	}

}
