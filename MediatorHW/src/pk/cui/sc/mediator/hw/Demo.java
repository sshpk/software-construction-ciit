package pk.cui.sc.mediator.hw;

public class Demo {

	public static void main(String[] args) {
		// create party and members
	    Party party = new PartyImpl();
	    Hobbit hobbit = new Hobbit();
	    Wizard wizard = new Wizard();
	    Rogue rogue = new Rogue();
	    Hunter hunter = new Hunter();

	    // add party members
	    party.addMember(hobbit);
	    party.addMember(wizard);
	    party.addMember(rogue);
	    party.addMember(hunter);

	    // perform actions -> the other party members
	    // are notified by the party
	    System.out.println("++++++++++++++++++++++");
	    hobbit.act(Action.ENEMY);
	    System.out.println("++++++++++++++++++++++");
	    wizard.act(Action.TALE);
	    System.out.println("++++++++++++++++++++++");
	    rogue.act(Action.GOLD);
	    System.out.println("++++++++++++++++++++++");
	    hunter.act(Action.HUNT);

	}

}
