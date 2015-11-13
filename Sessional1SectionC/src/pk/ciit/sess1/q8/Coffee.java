package pk.ciit.sess1.q8;

public class Coffee implements ICoffee{
	String flavor;
	
	public Coffee(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public void serveCoffee(Table table) {
		System.out.println("Serving "+getFlavor()+" coffee to the guest on "+table.getTableNumber());
		
	}
	
	public String getFlavor() {
		return flavor;
	}

}
