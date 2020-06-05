package pk.cui.sc.exercise5;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	
	public Book(String name, Author[] authors,double price, int qty){
		this(name,authors,price);
		setQty(qty);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public Book(String name, Author[] authors, double price) {
		this.name=name;
		this.authors=authors;
		setPrice(price);
	}
	@Override
	public String toString() {
		String str = "Book[name: "+getName()+" authors: ";
		for(Author a:authors){
					str+=a;
		}
		str+="price: "+getPrice()+
				"quantity: "+getQty()+"]";
		return str;
	}	
	}

