package pk.cuiatd.sc.sp19.s2.q8;

public class Demo {

	public static void main(String[] args) {
		System.out.println("*****a simple troll*****");
		Troll troll = new SimpleTroll();
		troll.attack(); 
		troll.fleeBattle(); 

		// change the behavior of the simple troll by adding a decorator
		System.out.println("*****a clubbed troll (with changed behavior)*****");
		Troll clubbedTroll = new ClubbedTroll(troll);
		clubbedTroll.attack(); 
		clubbedTroll.fleeBattle(); 

	}

}
