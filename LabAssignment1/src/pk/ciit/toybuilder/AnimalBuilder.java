package pk.ciit.toybuilder;

import pk.ciit.animals.Animal;

public abstract class AnimalBuilder {
	protected Animal animal;
	public abstract void buildAnimalArms();
	public abstract void buildAnimalBody();
	public abstract void buildAnimalHead();
	public abstract void buildAnimalLegs();
	public abstract void buildAnimalTail();
	public Animal getAnimal(){
		return animal;
	}
}
