
public class NonVegPizza implements Pizza{
	@Override
	public String getDesc() {
		return "NonVegPizza (350)";
	}
	@Override
	public double getPrice() {
		return 350;
	}
}
