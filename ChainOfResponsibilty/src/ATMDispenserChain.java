
public class ATMDispenserChain {
 
    private DispenserChain c1;
 
    public ATMDispenserChain() {
        // initialize the chain
        this.c1 = new Rupees1000Dispenser();
        DispenserChain c2 = new Rupees500Dispenser();
       
 
        // set the chain of responsibility
        c1.setNextChain(c2);

    }

	public void dispense(Currency currency) {
		c1.dispense(currency);
		
	}
}
