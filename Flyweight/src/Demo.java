
public class Demo {
	//private static final String colors[] =
	//	{ "Red", "Green", "Blue", "White", "Black" };
	public static void main(String[] args) {
		for(int i=0; i < 20; ++i) {
			CircleType type =
				ShapeFactory.getCircleType(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	
	private static int getRandomX() {
		return (int)(Math.random()*100 );
	}
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
}
