package pk.cui.sc.composite;

public class Leaf implements Component{

	@Override
	public String operation() {
		return "Leaf";
	}

	@Override
	public void addChild(Component child) {
		// No implementation
		
	}

	@Override
	public void removeChild(Component child) {
		// No implementation
		
	}

	@Override
	public boolean hasChildren() {
		return false;
	}

}
