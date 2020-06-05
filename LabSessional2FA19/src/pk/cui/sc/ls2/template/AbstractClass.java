package pk.cui.sc.ls2.template;

public abstract class AbstractClass {
	public void templateMethod(){
		concreteMethod1();
		abstractMethod1();
		concreteMethod2();
		hookMethod1();
		abstractMethod2();
		concreteMethod3();
		hookMethod2();
	}
	protected void concreteMethod1() {
		System.out.println("AbstractClass says: I am doing the bulk of the work");

	}
	protected void concreteMethod2() {
		System.out.println("AbstractClass says: But I let subclasses override some methods");

	}
	protected void concreteMethod3() {
		System.out.println("AbstractClass says: But I am doing all the work myself");

	}
	protected abstract void abstractMethod1(); 
	protected abstract void abstractMethod2();
	protected  void hookMethod1() {		}
	protected void hookMethod2() {		}
}
