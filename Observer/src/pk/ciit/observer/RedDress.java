package pk.ciit.observer;

import java.util.ArrayList;
import java.util.List;

public class RedDress implements Subject{

	private List<Observer> observers = new ArrayList<Observer>();
    private boolean inStock = false;
    
	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
		notifyObservers();
	}
	@Override
	public void notifyObservers() {
		System.out.println("Notifying to all the subscribers when product became available");
		 for (Observer ob : observers) {
             ob.update();
      }

	}
	@Override
	public void registerObserver(Observer observer) {
		 observers.add(observer);
		
	}
	@Override
	public void removeObserver(Observer observer) {
		 observers.remove(observer);
		
	}

}
