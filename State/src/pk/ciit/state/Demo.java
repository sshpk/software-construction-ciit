package pk.ciit.state;

public class Demo {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVOnState();
		State tvStopState = new TVOffState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();
	}

}
