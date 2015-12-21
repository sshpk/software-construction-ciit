package pk.ciit.money1;

public class Money{
	private int amount;		
	private String currency;

	public Money(int amount, String currency) {		
		this.amount = amount;
		this.currency = currency;
	}
   public int getAmount() {				
		return amount;
	}
   public String getCurrency() {				
		return currency;
	}
	public Money add(Money m2){
		int resultAmount = this.amount + m2.getAmount();
		return new Money(resultAmount, this.currency);
   }
	public boolean equals(Object anObject){
		boolean result = false;
		if(anObject instanceof Money){
          Money m2 = (Money) anObject;
			result = ((this.amount == m2.getAmount()) &&
						(this.currency == m2.getCurrency()));
		}
		return result;
   }
}