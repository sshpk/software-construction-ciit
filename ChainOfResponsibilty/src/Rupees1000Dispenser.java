
public class Rupees1000Dispenser implements DispenserChain{

	private DispenserChain chain;
	private final int WORTH = 1000;
    
    @Override
    public void setNextChain(DispenserChain nextChain) {
        this.chain=nextChain;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= WORTH){
            int num = cur.getAmount()/WORTH;
            int remainder = cur.getAmount() % WORTH;
            System.out.println("Dispensing "+num+" "+WORTH+" note");
            if(remainder !=0) 
            	this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
