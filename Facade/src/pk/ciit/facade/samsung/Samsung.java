package pk.ciit.facade.samsung;

import pk.ciit.facade.mobileshop.MobileShop;

public class Samsung implements MobileShop {  
	@Override  
	public void modelNo() {  
		System.out.println(" Samsung galaxy tab 3 ");  
	}  
	@Override  
	public void price() {  
		System.out.println(" Rs 45000.00 ");  
	}  
}  
