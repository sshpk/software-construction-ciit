package pk.ciit.visitor;

public class Book implements Element{
	private double price;
	private String name;
	
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

}
