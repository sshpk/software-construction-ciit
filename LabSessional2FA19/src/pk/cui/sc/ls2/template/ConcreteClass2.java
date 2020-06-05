package pk.cui.sc.ls2.template;

public class ConcreteClass2 extends AbstractClass{

	@Override
	protected void abstractMethod1() {
		System.out.println("ConcreteClass2 says: Implemented abstract method1");
	}

	@Override
	protected void abstractMethod2() {
		System.out.println("ConcreteClass2 says: Implemented abstract method2");
	}
	
	@Override
	protected void hookMethod1() {
		System.out.println("ConcreteClass2 says: Implemented hook method1");
	}

}

