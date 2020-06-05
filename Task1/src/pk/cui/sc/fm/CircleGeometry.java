package pk.cui.sc.fm;

public class CircleGeometry extends Geometry{

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
