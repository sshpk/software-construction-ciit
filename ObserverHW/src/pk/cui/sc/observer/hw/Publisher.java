package pk.cui.sc.observer.hw;

public interface Publisher {
	public void subscribe(Subscriber subscriber);
	public void unSubscribe(Subscriber Subscriber);
	public void notifySubscribers();
}
