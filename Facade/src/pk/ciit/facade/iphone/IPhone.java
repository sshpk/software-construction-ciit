package pk.ciit.facade.iphone;

import pk.ciit.facade.mobileshop.MobileShop;

public class IPhone implements MobileShop {  
    @Override  
    public void modelNo() {  
        System.out.println(" Iphone 6 ");  
    }  
    @Override  
    public void price() {  
    System.out.println(" Rs 65000.00 ");  
    }  
} 
