package pk.ciit.visitor;

public class PayeableVisitor implements Visitor{

	private double totalPayeableForCart;
	
	@Override
	public void visit(Book book) {
		totalPayeableForCart += book.getPrice();
	}

	@Override
	public void visit(CD cd) {
		totalPayeableForCart += cd.getPrice();
		
	}
	public double getTotalPayeableForCart() {
		return totalPayeableForCart;
	}
}
