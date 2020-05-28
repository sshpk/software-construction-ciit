package pk.cui.sc.observer;

public class Person implements Subscriber{
	String name;  
	  
    public Person(String personName) {  
        this.name = personName;  
    }  
  
    public String getName() {  
        return name;  
    }    
    @Override
    public void update() {    
        System.out.println("Hello "+name+", product is now in stock");  
    }  
}
