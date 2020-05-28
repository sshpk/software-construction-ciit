public class CircleType {
	private String name;
	private int radius;
	private String color;
	public CircleType(String name,String color, int radius) {
		this.name=name;
		this.radius = radius;
		this.color = color;
	}
	public void draw(int x,int y) {
		System.out.println(this.toString()+"is planted at ("+x+","+y+")");
	}
	@Override
	public String toString() {
		return new String ("CircleType[name "+name+", color : " + color+", radius :" + radius+"]");
	}
}