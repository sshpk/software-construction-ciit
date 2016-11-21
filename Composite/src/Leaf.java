import java.util.Arrays;

public class Leaf extends Component{
	public Leaf(String name) {
		super(name);
	}
	public void add(Component c) {
		System.out.println("Cannot add to a leaf");
		
	}
	public void remove(Component c) {
		System.out.println("Cannot remove from a leaf");
	}
	public void display(int depth) {
		char[] repeat = new char[depth];
		Arrays.fill(repeat, '-');
		System.out.println(new String(repeat) + name);
	}
}
