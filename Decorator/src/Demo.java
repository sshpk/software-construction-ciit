
public class Demo {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		System.out.println("Rectangle with normal border");
		rectangle.draw();
		
		System.out.println("\nRectangle with red border");
		Shape redRectangle = new RedShapeDecorator(rectangle);
		redRectangle.draw();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		System.out.println("\nCircle with red border");
		redCircle.draw();
		}
}
