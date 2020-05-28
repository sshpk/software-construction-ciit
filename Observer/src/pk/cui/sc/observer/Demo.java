package pk.cui.sc.observer;



public class Demo {

	public static void main(String[] args) {
		Person ahmed=new Person("Ahmed");  
        Person bilal=new Person("Bilal");  
          
        WhiteShirt dress=new WhiteShirt();  
          
        dress.subscribe(ahmed);  
        dress.subscribe(bilal);  
          
        //Now product is available  
        dress.setInstock(true);

	}

}
