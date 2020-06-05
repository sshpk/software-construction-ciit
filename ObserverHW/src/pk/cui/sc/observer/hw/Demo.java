package pk.cui.sc.observer.hw;


public class Demo {
	public static void main(String[] args) {
		Commentary commentary = new Commentary();
		Subscriber subscriber = new SMSSubscriber("Ahmed Ali [Abbottabad]");
		commentary.subscribe(subscriber);
		
		Subscriber subscriber2 = new SMSSubscriber("Irfan Khan [London]");
		commentary.subscribe(subscriber2);
		
		commentary.setDesc("Welcome to live Soccer match");
		commentary.setDesc("Current score 0-0");
		System.out.println();
		commentary.unSubscribe(subscriber2);
		
		System.out.println();
		commentary.setDesc("It’s a goal!!");
		commentary.setDesc("Current score 1-0");
		System.out.println();
		
		Subscriber subscriber3 = new SMSSubscriber("Marrie Smith [Berlin]");
		commentary.subscribe(subscriber3);
		System.out.println();
		commentary.setDesc("It’s another goal!!");
		commentary.setDesc("Half-time score 2-0");
	}
}
