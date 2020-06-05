package pk.cui.sc.observer.hw;

import java.util.ArrayList;
import java.util.List;

public class Commentary implements Publisher{
	private final List<Subscriber>subscribers=new ArrayList<Subscriber>();
	private String desc;
	
	@Override
	public void subscribe(Subscriber observer) {
		subscribers.add(observer);
		System.out.println();
	}
	@Override
	public void unSubscribe(Subscriber observer) {
		int index = subscribers.indexOf(observer);
		subscribers.remove(index);
	}
	@Override
	public void notifySubscribers() {
		for(Subscriber observer : subscribers){
			observer.update(desc);
		}
	}

	public void setDesc(String desc) {
		this.desc = desc;
		notifySubscribers();
	}
}
