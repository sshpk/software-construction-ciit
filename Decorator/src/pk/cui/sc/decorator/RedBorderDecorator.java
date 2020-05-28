package pk.cui.sc.decorator;

public class RedBorderDecorator extends ShapeDecorator{
	public RedBorderDecorator(Shape target){
		super(target);
	}
	@Override
	public void draw() {
		target.draw();
		setRedBorder();
		
	}
	private void setRedBorder(){
		System.out.println("Border Color: Red");
	}
}
