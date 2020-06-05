package pk.cui.sc.flyweight.pen;

public abstract class Pen {
	protected String color = null;
	protected BrushSize brushSize;
	public abstract void setColor(String color);
	public abstract void draw(String content); 
}
