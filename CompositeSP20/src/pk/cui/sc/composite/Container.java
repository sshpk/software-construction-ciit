package pk.cui.sc.composite;

import java.util.ArrayList;

public class Container implements Component{

	private ArrayList<Component> children = new ArrayList<Component>();
	@Override
	public String operation() {
		int i = 0;
		String result = "Branch(";

		for (Component child : children) {
			result += child.operation();
			if (i != children.size() - 1){
				result += "+";
			}
			i++;
		}
		return result + ")";
	}

	@Override
	public void addChild(Component child) {
		children.add(child);

	}

	@Override
	public void removeChild(Component child) {
		children.remove(child);

	}

	@Override
	public boolean hasChildren() {
		return true;
	}

}
