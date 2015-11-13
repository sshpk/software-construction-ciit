package pk.ciit.sess1.q8;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {
	Map<String, ICoffee> flavors;
	
	public CoffeeFactory() {
		flavors = new HashMap<String, ICoffee>();
	}
	ICoffee getCoffeeFlavor(String flavor){
		ICoffee coffee = flavors.get(flavor);
		if(coffee == null){
			coffee = new Coffee(flavor);
			flavors.put(flavor, coffee);
		}
		return coffee;
	}
	public int getTotalCoffeeFlavorsMade(){
		return flavors.size();
	}

}
