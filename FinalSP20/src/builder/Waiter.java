package builder;

public class Waiter {
	PizzaChef chef;

	public Waiter(PizzaChef chef) {
		this.chef = chef;
	}

	public void changeChef(PizzaChef chef) {
		this.chef = chef;
	}
	public Pizza cook(Pizza pizza){
		return null;
		
	}
}
