package pk.ciit.facade.mobileshop;

import pk.ciit.facade.blackberry.Blackberry;
import pk.ciit.facade.iphone.IPhone;
import pk.ciit.facade.samsung.Samsung;

public class ShopKeeper {
	private MobileShop iphone;  
	private MobileShop samsung;  
	private MobileShop blackberry;  

	public ShopKeeper(){  
		iphone= new IPhone();  
		samsung= new Samsung();  
		blackberry=new Blackberry();  
	}  
	public void sellIPhone(){  
		iphone.modelNo();  
		iphone.price();  
	}  
	public void sellSamsung(){  
		samsung.modelNo();  
		samsung.price();  
	}  
	public void sellBlackberry(){  
		blackberry.modelNo();  
		blackberry.price();  
	}  
}  
