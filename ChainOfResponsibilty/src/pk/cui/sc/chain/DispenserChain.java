package pk.cui.sc.chain;

public class DispenserChain {
	Dispenser d1;
	public DispenserChain(){
		d1 = new RupeesDispenser(5000);
		Dispenser d2 = new RupeesDispenser(1000);
		Dispenser d3 = new RupeesDispenser(500);
		
		d1.setNext(d2);
		d2.setNext(d3);
	}
	public void dispense(Currency c){
		d1.dispense(c);
	}
}
