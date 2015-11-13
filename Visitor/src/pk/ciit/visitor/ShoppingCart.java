package pk.ciit.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	//normal shopping cart stuff
	private List<Visitable> items = new ArrayList<Visitable>();
	public void addItem(Visitable item){
		items.add(item);
	}
	public double calculatePayeable() {
		//create a visitor
		PayeableVisitor visitor = new PayeableVisitor();
		//iterate through all items
		for(Visitable item: items) {
			item.accept(visitor);
		}
		double payeable = visitor.getTotalPayeableForCart();
		return payeable;
	}
}