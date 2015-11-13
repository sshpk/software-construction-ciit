package pk.ciit.sess1.q8;

public class Demo {
	private static CoffeeFactory coffeeFactory = new CoffeeFactory();
	
	static void takeOrder(int tableNumber, String flavor){
		Table table = new Table(tableNumber);
		ICoffee coffee = coffeeFactory.getCoffeeFlavor(flavor);
		coffee.serveCoffee(table);
		
		
	}
	public static void main(String[] args) {
		takeOrder(1, "Espresso");
		takeOrder(2, "Cappuchino");
		
		takeOrder(1, "Espresso");
		
		System.out.println("The number of coffee flavors served: "+coffeeFactory.getTotalCoffeeFlavorsMade());
	}

}
