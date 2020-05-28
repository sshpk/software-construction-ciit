import pk.cui.sc.chain.Currency;

public class RupeesDispenser implements Dispenser{

	private Dispenser next;
	private int worth;
	
	public RupeesDispenser(int worth) {
		this.worth = worth;
	}
    
    @Override
    public void setNext(Dispenser next) {
        this.next=next;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= worth){
            int num = cur.getAmount()/worth;
            int remainder = cur.getAmount() % worth;
            System.out.println("Dispensing "+num+" "+worth+" note");
            if(remainder !=0 && next!=null) 
            	next.dispense(new Currency(remainder));
        }else if(next!=null){
            next.dispense(cur);
        }
        else{
        	System.out.println(cur.getAmount()+" cannot be processed");
        }
    }

}
