package pk.cui.sc.ls2.template;

public class ConcreteClass1 extends AbstractClass{

	@Override
	protected void abstractMethod1() {
		System.out.println("ConcreteClass1 says: Implemented abstract method1");
	}

	@Override
	protected void abstractMethod2() {
		System.out.println("ConcreteClass1 says: Implemented abstract method2");
	}

}
