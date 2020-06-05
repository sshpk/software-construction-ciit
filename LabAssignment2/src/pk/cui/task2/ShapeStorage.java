package pk.cui.task2;

import java.util.Iterator;

public class ShapeStorage {
	private Shape []shapes = new Shape[5];
	private int index;
	private Iterator<Shape> iterator=new ShapeIterator();
	public void addShape(String name){
		int i = index++;
		shapes[i] = new Shape(i,name);
	}
	public Shape[] getShapes(){
		return shapes;
	}
	public Iterator<Shape> getIterator(){
		return iterator;
	}
	public class ShapeIterator implements Iterator<Shape>{
		int pos;
		@Override
		public boolean hasNext() {
			if(pos >= shapes.length || shapes[pos] == null)
				return false;
			return true;
		}
		@Override
		public Shape next() {
			return shapes[pos++];
		}
		@Override
		public void remove() {
			if(pos <=0 )
				throw new IllegalStateException("Illegal position");
			if(shapes[pos-1] !=null){
				for (int i= pos-1; i<(shapes.length-1);i++){
					shapes[i] = shapes[i+1];
				}
				shapes[shapes.length-1] = null;
			}
		}
	}
}
