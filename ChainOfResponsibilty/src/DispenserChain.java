import pk.cui.sc.chain.Currency;

public class DispenserChain {
 
    private Dispenser start;
 
    public DispenserChain() {
        // initialize the chain
        this.start = new RupeesDispenser(1000);
        Dispenser next = new RupeesDispenser(500);
       
 
        // set the chain of responsibility
        start.setNext(next);

    }

	public void dispense(Currency currency) {
		start.dispense(currency);
		
	}
}
