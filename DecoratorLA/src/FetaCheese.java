
public class FetaCheese extends PizzaDecorator{
	
	public FetaCheese(Pizza pizza){
		super(pizza);
	}
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Feta Cheese (25.88)";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice()+25.88;
	}
}
