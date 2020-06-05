
public class Chicken extends PizzaDecorator{
	
	public Chicken(Pizza pizza){
		super(pizza);
	}
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Chicken (12.75)";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice()+12.75;
	}
}