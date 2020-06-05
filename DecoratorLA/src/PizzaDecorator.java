
public abstract class PizzaDecorator implements Pizza {
	protected Pizza pizza;
	
	
	public PizzaDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}


	@Override
	public String getDesc() {
		return "Toppings";
	}
}
