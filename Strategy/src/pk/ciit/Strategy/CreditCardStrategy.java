package pk.ciit.Strategy;

public class CreditCardStrategy implements PaymentStrategy {
	private String name;
	private String cardNumber;
	private String cardPIN;
	private String dateOfExpiry;

	public CreditCardStrategy(String name, String cardNumber, String cardPIN, String expiryDate){
		this.name=name;
		this.cardNumber=cardNumber;
		this.cardPIN = cardPIN;
		this.dateOfExpiry=expiryDate;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount +" Rupees paid with credit/debit card");
	}
}