package pk.cui.sc.chain;

public class RupeesDispenser implements Dispenser{
	private Dispenser next=null;
	private int worth;
	
	
	public RupeesDispenser(int worth) {
		this.worth = worth;
	}

	@Override
	public void setNext(Dispenser dispenser) {
		this.next=dispenser;
		
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount()>=worth){
			int quotient = currency.getAmount()/worth;
			int remainder = currency.getAmount()%worth;
			System.out.println("Dispensing "+quotient+" in "+worth+" notes");
			if(remainder!=0 && next!=null){
				next.dispense(new Currency(remainder));
			}
		}
		else if (next!=null){
			next.dispense(currency);
		}
		else{
			System.out.println(currency.getAmount()+" cannot be processed");
		}
	}

}
