package pk.ciit.mediator;

public class Demo {

	public static void main(String[] args) {
		ApplicationMediator mediator = new ApplicationMediator();
		DesktopColleague desktopColleague = new DesktopColleague(mediator);
		MobileColleague mobileColleague = new MobileColleague(mediator);
		
		mediator.addColleague(desktopColleague);
		mediator.addColleague(mobileColleague);
		
		desktopColleague.send("Hello World");
		mobileColleague.send("Hello");
	}

}
