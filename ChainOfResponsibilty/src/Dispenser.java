import pk.cui.sc.chain.Currency;

public interface Dispenser {

	void setNext(Dispenser next);

	void dispense(Currency cur);
}
