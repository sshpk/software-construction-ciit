package pk.ciit.mediator;

public class DesktopColleague extends Colleague{
	
	public DesktopColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receive(String message) {
		System.out.println("Desktop colleague recieved the message "+message);
		
	}

}
