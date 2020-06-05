
public class Mutton extends PizzaDecorator{
	
	public Mutton(Pizza pizza){
		super(pizza);
	}
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Mutton (18.12)";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice()+18.12;
	}
}
