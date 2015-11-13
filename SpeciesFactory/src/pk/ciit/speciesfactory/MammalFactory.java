package pk.ciit.speciesfactory;

import pk.ciit.speciesfactory.animals.Animal;
import pk.ciit.speciesfactory.animals.Cat;
import pk.ciit.speciesfactory.animals.Dog;
import pk.ciit.speciesfactory.animals.MammalType;
import pk.ciit.speciesfactory.animals.SpecieType;

public class MammalFactory extends SpecieFactory{

	@Override
	public Animal getAnimal(SpecieType mammalType) {
		if(mammalType == null)
			return null;
		if (mammalType.equals(MammalType.DOG))
			return new Dog();
		else if (mammalType.equals(MammalType.CAT))
			return new Cat();
		else
			return null;
	}

}
