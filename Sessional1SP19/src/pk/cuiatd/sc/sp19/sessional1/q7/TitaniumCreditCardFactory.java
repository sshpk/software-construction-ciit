package pk.cuiatd.sc.sp19.sessional1.q7;

public class TitaniumCreditCardFactory extends CreditCardFactory{
	
	@Override
	public ICreditCard createCard() {
		card = new TitaniumCreditCard();
		return card;
	}

}
