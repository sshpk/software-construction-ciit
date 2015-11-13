package pk.ciit.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items = new ArrayList<Item>();
	public void addItem(Item item){
		items.add(item);
	}
	public int calculateAmount(){
		int amount = 0;
		for(Item it:items){
			amount += it.getPrice();
		}
		return amount;
	}
	public void pay(PaymentStrategy paymentMethod){
		int amount = calculateAmount();
        paymentMethod.pay(amount);
    }

}
