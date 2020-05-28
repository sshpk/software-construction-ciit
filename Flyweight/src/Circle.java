public class Circle {
	
	private int x;
	private int y;
	private CircleType type;
	public Circle(int x, int y, CircleType type) {
		super();
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public void draw() {
        type.draw(x, y);
    }
}