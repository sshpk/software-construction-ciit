package pk.ciit.speciesfactory;

import pk.ciit.speciesfactory.animals.Animal;
import pk.ciit.speciesfactory.animals.SpecieType;

public abstract class SpecieFactory {
	public abstract Animal getAnimal(SpecieType type);
}
