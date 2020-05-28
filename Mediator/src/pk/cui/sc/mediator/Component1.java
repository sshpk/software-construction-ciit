package pk.cui.sc.mediator;

public class Component1 extends BaseComponent{

	public void doA()  {
        System.out.println("Component 1 does A.");
        mediator.notify(this, "A");
    }

    public void doB()  {
        System.out.println("Component 1 does B.");
        mediator.notify(this, "B");
    }
}
