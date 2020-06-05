package pk.cui.sc.cor;

public abstract class BaseDispenser implements Dispenser{
	protected Dispenser next;
	public void setNext(Dispenser dispenser){
		next=dispenser;
	}
}
