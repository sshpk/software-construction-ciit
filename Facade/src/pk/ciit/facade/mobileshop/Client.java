package pk.ciit.facade.mobileshop;

public class Client {

	public static void main(String[] args) {
		ShopKeeper shopKeeper = new ShopKeeper();
		shopKeeper.sellIPhone();
		
		shopKeeper.sellSamsung();
		
		shopKeeper.sellBlackberry();
	}

}
