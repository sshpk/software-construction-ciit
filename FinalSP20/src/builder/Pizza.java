package builder;

public class Pizza {
	String size;
	String name;
	String topping;
	public Pizza(String size, String name, String topping) {
		super();
		this.size = size;
		this.name = name;
		this.topping = topping;
	}
	public String getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
	public String getTopping() {
		return topping;
	}
	

	
}
