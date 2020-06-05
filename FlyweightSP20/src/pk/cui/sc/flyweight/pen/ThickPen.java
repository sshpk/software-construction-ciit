package pk.cui.sc.flyweight.pen;

public class ThickPen extends Pen {
	
	public ThickPen(BrushSize size, String color){
		brushSize = size;//intrinsic state - shareable
		this.color= color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing "+brushSize+ " content in color : " + color);
	}
}
