package pk.ciit.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	//normal shopping cart stuff
	private List<Element> items = new ArrayList<Element>();
	public void addItem(Element item){
		items.add(item);
	}
	public double calculatePayeable() {
		//create a visitor
		PayeableVisitor visitor = new PayeableVisitor();
		//iterate through all items
		for(Element item: items) {
			item.accept(visitor);
		}
		double payeable = visitor.getTotalPayeableForCart();
		return payeable;
	}
}