package pk.cui.sc.cor;

public class ConcreteDispenser extends BaseDispenser{
	private int worth;
	
	public ConcreteDispenser(int worth){
		this.worth= worth;
	}
	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= worth){
            int quotient = currency.getAmount()/worth;
            int remainder = currency.getAmount() % worth;
            System.out.println("Dispensing "+quotient+" note(s) of "+worth);
            if(remainder !=0) 
            	next.dispense(new Currency(remainder));
        }else{
            next.dispense(currency);
        }
		
	}
}
