package pk.ciit.visitor;

public class Demo {

	public static void main(String[] args) {
		Book book = new Book("Code complete", 120);
		CD cd = new CD("Design patterns in java: a practical tutorial", 100);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addItem(book);
		shoppingCart.addItem(cd);
		
		double payeable = shoppingCart.calculatePayeable();
		System.out.println("Total amount payeable = "+payeable);

	}

}
