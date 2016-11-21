
public class RupeesDispenser implements DispenserChain{

	private DispenserChain chain;
	private int worth;
	
	public RupeesDispenser(int worth) {
		this.worth = worth;
	}
    
    @Override
    public void setNextChain(DispenserChain nextChain) {
        this.chain=nextChain;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= worth){
            int num = cur.getAmount()/worth;
            int remainder = cur.getAmount() % worth;
            System.out.println("Dispensing "+num+" "+worth+" note");
            if(remainder !=0) 
            	this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
