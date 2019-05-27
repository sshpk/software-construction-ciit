package pk.cuiatd.sc.sp19.sessional1.q7;

public class MoneyBackCreditCardFactory extends CreditCardFactory{
	
	@Override
	public ICreditCard createCard() {
		card = new MoneyBackCreditCard();
		return card;
	}

}
