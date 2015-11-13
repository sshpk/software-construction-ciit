package pk.ciit.toybuilder;

import pk.ciit.animals.Animal;

public class Kid {
	private String name;
	public Kid(String name) {
		setName(name);
	}
	public Animal makeAimal(AnimalBuilder builder){
		System.out.println("I am "
								+getName()
								+". I am creating "
								+builder.getAnimal().getAnimalName());
		System.out.println("*****************************");
		builder.buildAnimalArms();
		builder.buildAnimalBody();
		builder.buildAnimalHead();
		builder.buildAnimalLegs();
		builder.buildAnimalTail();
		
		return builder.getAnimal();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
