package pk.cuiatd.sc.sp19.sessional1.q7;

public class PlatinumCreditCardFactory extends CreditCardFactory{
	
	@Override
	public ICreditCard createCard() {
		card = new PlatiniumCreditCard();
		return card;
	}

}
