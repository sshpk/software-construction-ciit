import java.util.ArrayList;
import java.util.Arrays;

public class Composite extends Component{
	private ArrayList<Component> children = 
			new ArrayList<Component>();
	public Composite(String name) {
		super(name);
	}
	public void add(Component c) {
		children.add(c);
	}
	public void remove(Component c) {
		children.remove(c);
	}
	public void display(int depth) {
		char[] repeat = new char[depth];
		Arrays.fill(repeat, '-');
		System.out.println(new String(repeat) + name);
		for(Component c: children){
			c.display(depth+2);
		}

	}
}
