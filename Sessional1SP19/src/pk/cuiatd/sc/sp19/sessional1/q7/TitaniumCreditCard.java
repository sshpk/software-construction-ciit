package pk.cuiatd.sc.sp19.sessional1.q7;

public class TitaniumCreditCard implements ICreditCard{

	@Override
	public String getCardType() {
		return "Titanium Credit Card";
	}

	@Override
	public int getCreditLimit() {
		return 25000;
	}

	@Override
	public int getAnnualCharges() {
		return 1500;
	}
	@Override
	public String toString() {
		return "TitaniumCreditCard[Card Type: "+getCardType()+
				", Credit Limit: "+getCreditLimit()+
				", Annual Charges: "+getAnnualCharges()+"]";
	}
}