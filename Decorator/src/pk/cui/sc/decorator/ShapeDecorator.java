package pk.cui.sc.decorator;

public abstract class ShapeDecorator implements Shape{
	protected Shape target;
	public ShapeDecorator(Shape target){
		this.target=target;
	}

}
