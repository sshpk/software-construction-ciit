package pk.ciit.speciesfactory;

import pk.ciit.speciesfactory.animals.Animal;
import pk.ciit.speciesfactory.animals.MammalType;
import pk.ciit.speciesfactory.animals.ReptileType;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		
		SpecieFactory mammalFactory = factoryProducer.getFactory(FactoryType.MAMMAL);
		
		Animal animal1 = mammalFactory.getAnimal(MammalType.DOG);
		animal1.makeSound();
		
		Animal animal2 = mammalFactory.getAnimal(MammalType.CAT);
		animal2.makeSound();
		
		SpecieFactory reptileFactory = factoryProducer.getFactory(FactoryType.REPTILE);
		
		Animal animal3 = reptileFactory.getAnimal(ReptileType.SNAKE);
		animal3.makeSound();
		
		Animal animal4 = reptileFactory.getAnimal(ReptileType.TYRANNOSAURUS);
		animal4.makeSound();

	}

}
