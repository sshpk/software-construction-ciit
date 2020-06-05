package pk.cui.sc.flyweight.pen;

public class ThinPen extends Pen {
    
    public ThinPen(){
    	brushSize = BrushSize.THIN;
    }
     
    public void setColor(String color) {
        this.color = color;
    }
 
    @Override
    public void draw(String content) {
        System.out.println("Drawing THIN content in color : " + color);
    }
}
