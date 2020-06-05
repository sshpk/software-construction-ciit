package pk.cui.sc.cor;

public interface Dispenser {
	void setNext(Dispenser dispenser);
	void dispense(Currency currency);
}
