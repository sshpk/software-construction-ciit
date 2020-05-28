package pk.cui.sc.mediator;

public class Component2 extends BaseComponent{


	public void doC(){
        System.out.println("Component 2 does C.");
        mediator.notify(this, "C");
    }
	public void doD(){
        System.out.println("Component 2 does D.");
        mediator.notify(this, "D");
    }
}
