
public class ATMDispenserChain {
 
    private DispenserChain c1;
 
    public ATMDispenserChain() {
        // initialize the chain
        this.c1 = new RupeesDispenser(1000);
        DispenserChain c2 = new RupeesDispenser(500);
       
 
        // set the chain of responsibility
        c1.setNextChain(c2);

    }

	public void dispense(Currency currency) {
		c1.dispense(currency);
		
	}
}
