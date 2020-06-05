
public class RedOnions extends PizzaDecorator{
	
	public RedOnions(Pizza pizza){
		super(pizza);
	}
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Red Onions (3.75)";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice()+3.75;
	}
}
