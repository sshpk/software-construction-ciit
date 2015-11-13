package pk.ciit.speciesfactory;

import pk.ciit.speciesfactory.animals.Animal;
import pk.ciit.speciesfactory.animals.ReptileType;
import pk.ciit.speciesfactory.animals.Snake;
import pk.ciit.speciesfactory.animals.SpecieType;
import pk.ciit.speciesfactory.animals.Tyrannosaurus;

public class ReptileFactory extends SpecieFactory {

	@Override
	public Animal getAnimal(SpecieType specieType) {
		if(specieType == null)
			return null;
		if(specieType.equals(ReptileType.SNAKE))
			return new Snake();
		else if(specieType.equals(ReptileType.TYRANNOSAURUS))
			return new Tyrannosaurus();
		else
			return null;
		
	}

}
