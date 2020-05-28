package pk.cui.sc.chain;

public class Demo {

	public static void main(String[] args) {
		DispenserChain chain = new DispenserChain();
		chain.dispense(new Currency(100));

	}

}
