package pk.cui.sc.mediator;

public class ConcreteMediator implements Mediator{
	private Component1 component1;
    private Component2 component2;

    public ConcreteMediator(Component1 component1, Component2 component2){
        this.component1 = component1;
        this.component1.setMediator(this);
        this.component2 = component2;
        this.component2.setMediator(this);
    } 

    public void notify(Object sender, String event){
        if (event.equals("A")){
            System.out.println("Mediator reacts on A and triggers following operations:");
            component2.doC();
        }
        if (event.equals("D")){
        	System.out.println("Mediator reacts on D and triggers following operations:");
            component1.doB();
            component2.doC();
        }
    }
}
