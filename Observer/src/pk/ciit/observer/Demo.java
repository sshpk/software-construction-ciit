package pk.ciit.observer;

public class Demo {

	public static void main(String[] args) {
		Person lizza=new Person("Lizza");  
        Person sumbul=new Person("Sumbul");  
          
        RedDress dress=new RedDress();  
          
        dress.registerObserver(lizza);  
        dress.registerObserver(sumbul);  
          
        //Now product is available  
        dress.setInStock(true);; 

	}

}
