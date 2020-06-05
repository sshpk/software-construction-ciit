package pk.cui.task2;

import java.util.Iterator;

public class TestIteratorPattern {
	public static void main(String[] args) {
		ShapeStorage storage = new ShapeStorage();
		storage.addShape("Polygon");
		storage.addShape("Hexagon");
		storage.addShape("Circle");
		storage.addShape("Rectangle");
		storage.addShape("Square");
		Iterator<Shape> iterator = storage.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("Apply removing while iterating...");
		iterator = storage.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			iterator.remove();
		}
	}

}
