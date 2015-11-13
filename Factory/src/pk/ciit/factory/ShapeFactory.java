package pk.ciit.factory;

public class ShapeFactory {
	public Shape getShape(ShapeType name){
		if(name == null)
			return null;
		if(name.equals(ShapeType.CIRCLE)){
			return new Circle();
		}
		else if(name.equals(ShapeType.SQUARE)){
			return new Square();
		}
		else if (name.equals(ShapeType.RECTANGLE)){
			return new Rectangle();
		}
		else
			return null;
	}
}
