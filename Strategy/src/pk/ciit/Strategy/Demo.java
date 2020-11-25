package pk.ciit.Strategy;

public class Demo {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("Code complete",120);
		Item item2 = new Item("Design patterns in java: a practical tutorial",100);

		cart.addItem(item1);
		cart.addItem(item2);

		cart.setPaymentMethod(new PaypalStrategy("myemail@example.com", "mypwd"));
		//pay by paypal
		cart.checkout();

		//pay by credit card
		cart.setPaymentMethod(new CreditCardStrategy("Syed Sajid Hussain", "1234567890123456", "1234", "12/15"));
		cart.checkout();

	}

}
