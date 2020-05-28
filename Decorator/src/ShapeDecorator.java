import pk.cui.sc.decorator.Shape;

public abstract class ShapeDecorator implements Shape{
	protected Shape decoratedShape;
	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}
}
