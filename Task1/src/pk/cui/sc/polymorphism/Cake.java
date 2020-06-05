package pk.cui.sc.polymorphism;

public abstract class Cake {
	String name;
	double rate;
	public Cake(String name, double rate) {
		this.name=name;
		this.rate=rate;
	}
	public String getName() {
		return name;
	}
	public double getRate() {
		return rate;
	}
	public abstract double calculatePrice();
}
