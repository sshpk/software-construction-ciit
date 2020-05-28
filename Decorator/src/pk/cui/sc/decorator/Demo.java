package pk.cui.sc.decorator;


public class Demo {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		System.out.println("Rectangle with normal border");
		rectangle.draw();
		
		System.out.println("\nRectangle with red border");
		Shape redRectangle = new RedBorderDecorator(rectangle);
		redRectangle.draw();
		
		System.out.println("\nRectangle with red and green border");
		Shape greenRedRectangle = new GreenBorderDecorator(redRectangle);
		greenRedRectangle.draw();
		
		Shape greenCircle = new GreenBorderDecorator(new Circle());
		System.out.println("\nCircle with green border");
		greenCircle.draw();
		}
}
