package pk.cui.sc.composite;

public class Demo {
	public static void main (String args[]){
		Leaf leaf = new Leaf();
		System.out.println("Client: I've created a simple component:");
		System.out.println(leaf.operation());

		Container tree = new Container();
		Container branch1 = new Container();
		branch1.addChild(new Leaf());
		branch1.addChild(new Leaf());

		Container branch2 = new Container();
		branch2.addChild(new Leaf());

		tree.addChild(branch1);
		tree.addChild(branch2);

		System.out.println("Client: Now I've created a composite tree:");
		System.out.println(tree.operation());

	}
}
