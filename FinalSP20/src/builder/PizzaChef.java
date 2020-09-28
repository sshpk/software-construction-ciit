package builder;

public interface PizzaChef {
	void makeDough();
	void makeSauce();
	void addToppings();
	void bake();
	Pizza getResult();
}
