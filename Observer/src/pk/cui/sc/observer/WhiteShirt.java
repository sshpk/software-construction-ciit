package pk.cui.sc.observer;

import java.util.ArrayList;

public class WhiteShirt implements Publisher{
	private ArrayList<Subscriber> subsrcibers = new ArrayList<Subscriber>();
	private boolean inStock = false;
	
	public boolean isInStock(){
		return inStock;
	}
	
	public void setInstock(boolean inStock){
		this.inStock=inStock;
		notifySubscribers();
	}
	@Override
	public void subscribe(Subscriber s) {
		subsrcibers.add(s);
		
	}

	@Override
	public void unsubscribe(Subscriber s) {
		subsrcibers.remove(s);
		
	}

	@Override
	public void notifySubscribers() {
		System.out.println("Notifying all the subscribers when the product becomes available");
		for(Subscriber s:subsrcibers){
			s.update();
		}
		
	}

}
