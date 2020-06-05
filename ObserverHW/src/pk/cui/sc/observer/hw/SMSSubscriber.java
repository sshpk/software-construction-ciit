package pk.cui.sc.observer.hw;

public class SMSSubscriber implements Subscriber{
	private String userInfo;
	public SMSSubscriber(String userInfo){
		this.userInfo = userInfo;
	}
	@Override
	public void update(String desc) {
		System.out.println("["+userInfo+"]: "+desc);

	}
	@Override
	public String toString() {
		return "SMSSubscriber [userInfo=" + userInfo + "]";
	}
}
