package pk.ciit.toybuilder;

import pk.ciit.animals.Kitten;

public class KittenBuilder extends AnimalBuilder{

	public KittenBuilder() {
		animal = new Kitten();
	}
	@Override
	public void buildAnimalArms() {
		animal.setArms("kitten arms");
	}

	@Override
	public void buildAnimalBody() {
		animal.setBody("kitten body");
		
	}

	@Override
	public void buildAnimalHead() {
		animal.setHead("Kitten head");
		
	}

	@Override
	public void buildAnimalLegs() {
		animal.setLegs("kitten legs");
		
	}

	@Override
	public void buildAnimalTail() {
		animal.setTail("kitten tail");
		
	}

}
