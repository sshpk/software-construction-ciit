import java.text.DecimalFormat;

public class Restaurant {
	public static void main(String[] args){
		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new VegPizza();
		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);
		pizza = new Spinach(pizza);
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
		pizza = new NonVegPizza();
		pizza = new Beef(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Mutton(pizza);
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
	}
}
