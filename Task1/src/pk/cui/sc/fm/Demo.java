package pk.cui.sc.fm;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		Geometry circleGeometry = new CircleGeometry();
		Geometry squareGeometry = new SquareGeometry();
		Geometry rectangleGeometry = new RectangleGeometry();
		
		// create and add two circles
		shapes.add(circleGeometry.createShape());
		shapes.add(circleGeometry.createShape());
		
		// create and add a square
		shapes.add(squareGeometry.createShape());
		
		// create and add a rectangle
		shapes.add(rectangleGeometry.createShape());
		
		//draw all
		for(Shape shape:shapes){
			shape.draw();
		}
	}

}
