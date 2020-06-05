package pk.cui.sc.cor;

public class ATMDispenserChain {
	private Dispenser d1;
	public ATMDispenserChain(){
		d1=new ConcreteDispenser(5000);
		Dispenser d2=new ConcreteDispenser(1000);
		Dispenser d3=new ConcreteDispenser(500);
		
		d1.setNext(d2);
		d2.setNext(d3);
	}
	public void pay(Currency currency){
		d1.dispense(currency);
	}
}
