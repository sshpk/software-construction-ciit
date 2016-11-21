abstract public class Component {
	protected String name;
	// Constructor    
	public Component(String name){
		this.name = name;
	}
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);
}
