package pk.cui.sc.decorator;

public class GreenBorderDecorator extends ShapeDecorator{
	public GreenBorderDecorator(Shape target){
		super(target);
	}
	@Override
	public void draw() {
		target.draw();
		setGreenBorder();
		
	}
	private void setGreenBorder(){
		System.out.println("Border Color: Green");
	}
}
