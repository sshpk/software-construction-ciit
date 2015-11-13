package pk.ciit.speciesfactory;

public class FactoryProducer {
	public SpecieFactory getFactory(FactoryType factoryType){
		if(factoryType == null)
			return null;
		if(factoryType.equals(FactoryType.MAMMAL))
				return new MammalFactory();
		else if(factoryType.equals(FactoryType.REPTILE))
				return new ReptileFactory();
		else
			return null;
	}
}
