package pk.ciit.toybuilder;

import pk.ciit.animals.Monkey;

public class MonkeyBuilder extends AnimalBuilder{

	public MonkeyBuilder() {
		animal = new Monkey();
	}
	
	@Override
	public void buildAnimalArms() {
		animal.setArms("monkey arms");
		
	}

	@Override
	public void buildAnimalBody() {
		animal.setBody("monkey body");
		
	}

	@Override
	public void buildAnimalHead() {
		animal.setHead("monkey head");
		
	}

	@Override
	public void buildAnimalLegs() {
		animal.setLegs("monkey legs");
		
	}

	@Override
	public void buildAnimalTail() {
		animal.setTail("monkey tail");
		
	}

}
