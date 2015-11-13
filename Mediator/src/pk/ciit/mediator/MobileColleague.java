package pk.ciit.mediator;

public class MobileColleague extends Colleague{

	public MobileColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receive(String message) {
		System.out.println("Mobile colleague recieved the message "+message);
		
	}

}
