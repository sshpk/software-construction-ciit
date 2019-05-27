package pk.cuiatd.sc.sp19.sessional1.q7;

public class Demo {

	public static void main(String[] args) {
		CreditCardFactory factory = new MoneyBackCreditCardFactory();
		ICreditCard card = factory.createCard();
		System.out.println(card);
		
		factory = new TitaniumCreditCardFactory();
		card = factory.createCard();
		System.out.println(card);
		
		factory = new PlatinumCreditCardFactory();
		card = factory.createCard();
		System.out.println(card);
	}

}
