package pk.cui.sc.prototype;

public abstract class Shape {
	private String color;
	
	public abstract Shape clone();

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public Shape(Shape target){
		if(target!=null)
			this.color=target.getColor();
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Shape))
			return false;
		Shape shape2=(Shape)obj;
		String color2=shape2.getColor();
		if(color2.equals(this.color))
			return true;
		else
			return false;
	}
}
