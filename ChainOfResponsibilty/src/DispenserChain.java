
public interface DispenserChain {

	void setNextChain(DispenserChain nextChain);

	void dispense(Currency cur);
}
