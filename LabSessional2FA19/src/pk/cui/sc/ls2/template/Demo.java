package pk.cui.sc.ls2.template;

public class Demo {
	public static void main(String[] args) {
		System.out.println("client code working with the ConcreteClass1:");
		AbstractClass c = new ConcreteClass1();
		c.templateMethod();
		System.out.print("\n");
		
		System.out.println("client code working with the ConcreteClass2:");
		c = new ConcreteClass2();
		c.templateMethod();

	}

}
