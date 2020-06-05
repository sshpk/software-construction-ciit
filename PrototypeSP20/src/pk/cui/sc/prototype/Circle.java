package pk.cui.sc.prototype;

public class Circle extends Shape{
	private int radius;

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	public Circle(Circle target){
		super(target);
		if (target != null) 
		this.radius=target.getRadius();
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle)||!super.equals(obj) )
			return false;
		Circle otherCircle =(Circle)obj;
		return(otherCircle.getRadius()==radius);
	}
}
