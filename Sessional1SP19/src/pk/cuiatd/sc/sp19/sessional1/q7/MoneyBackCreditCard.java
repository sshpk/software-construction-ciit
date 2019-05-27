package pk.cuiatd.sc.sp19.sessional1.q7;

public class MoneyBackCreditCard implements ICreditCard{

	@Override
	public String getCardType() {
		return "Money Back Credit Card";
	}

	@Override
	public int getCreditLimit() {
		return 15000;
	}

	@Override
	public int getAnnualCharges() {
		return 500;
	}
	
	@Override
	public String toString() {
		return "MoneyBackCreditCard[Card Type: "+getCardType()+
				", Credit Limit: "+getCreditLimit()+
				", Annual Charges: "+getAnnualCharges()+"]";
	}

}
