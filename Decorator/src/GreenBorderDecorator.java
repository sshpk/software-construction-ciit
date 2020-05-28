import pk.cui.sc.decorator.Shape;

public class GreenBorderDecorator extends ShapeDecorator {
	public GreenBorderDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	@Override
	public void draw() {
		decoratedShape.draw();
		setGreenBorder();
	}
	private void setGreenBorder(){
		System.out.println("Border Color: Green");
	}
}
