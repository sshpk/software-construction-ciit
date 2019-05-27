package pk.cuiatd.sc.sp19.sessional1.q7;

public class PlatiniumCreditCard implements ICreditCard{

	@Override
	public String getCardType() {
		return "Platinium Credit Card";
	}

	@Override
	public int getCreditLimit() {
		return 35000;
	}

	@Override
	public int getAnnualCharges() {
		return 2000;
	}
	@Override
	public String toString() {
		return "PlatiniumCreditCard[Card Type: "+getCardType()+
				", Credit Limit: "+getCreditLimit()+
				", Annual Charges: "+getAnnualCharges()+"]";
	}
}