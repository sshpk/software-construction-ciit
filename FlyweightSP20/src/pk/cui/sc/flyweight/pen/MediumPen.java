package pk.cui.sc.flyweight.pen;

public class MediumPen extends Pen {
    
    public MediumPen() {
		brushSize = BrushSize.MEDIUM;
	}
     
    public void setColor(String color) {
        this.color = color;
    }
 
    @Override
    public void draw(String content) {
        System.out.println("Drawing MEDIUM content in color : " + color);
    }
}
