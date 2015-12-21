package pk.ciit.Money3;

import java.util.Hashtable;

public class MoneyBag {
	private Hashtable<String, Money> monies = new Hashtable<String, Money>(5);
	MoneyBag(Money m1, Money m2) { 
		appendMoney(m1);
		appendMoney(m2);
	}
	MoneyBag(Money bag[]) {
		for (int i= 0; i < bag.length; i++) {
			appendMoney(bag[i]);
		}
	}
	private void appendMoney(Money aMoney) {
		Money m = (Money) monies.get(aMoney.getCurrency());
		if (m != null) { m = m.add(aMoney); }
		else { m = aMoney; }
		monies.put(aMoney.getCurrency(), m);
	}

}
