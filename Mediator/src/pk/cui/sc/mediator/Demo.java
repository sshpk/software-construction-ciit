package pk.cui.sc.mediator;

public class Demo {

	public static void main(String[] args) {
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        new ConcreteMediator(component1, component2);

        System.out.println("Client triggets operation A.");
        component1.doA();

        System.out.println();

        System.out.println("Client triggers operation D.");
        component2.doD();

	}

}
