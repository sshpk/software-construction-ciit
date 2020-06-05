
public class Beef extends PizzaDecorator{
	
	public Beef(Pizza pizza){
		super(pizza);
	}
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Beef (14.25)";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice()+14.25;
	}
}
