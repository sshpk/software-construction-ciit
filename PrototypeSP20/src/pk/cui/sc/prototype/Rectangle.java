package pk.cui.sc.prototype;

public class Rectangle extends Shape{
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Rectangle(String color, int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Rectangle(Rectangle target){
		super(target);
		if(target!=null){
			this.width=target.getWidth();
			this.height=target.getHeight();
		}
	}
	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Rectangle)|| !super.equals(obj))
			return false;
		Rectangle rectangle2=(Rectangle)obj;
		return ((rectangle2.getWidth()==this.width)&&(rectangle2.getHeight()==this.height));
	}
}
