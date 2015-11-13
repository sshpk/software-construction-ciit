package pk.ciit.visitor;

public class CD implements Visitable{
	private String title;
	private double price;
	public CD(String title, double price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}
}