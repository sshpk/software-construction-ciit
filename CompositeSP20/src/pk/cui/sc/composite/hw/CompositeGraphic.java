package pk.cui.sc.composite.hw;

import java.util.ArrayList;

/** "Composite" */
class CompositeGraphic implements Graphic {
    //Collection of child graphics.
    private final ArrayList<Graphic> childGraphics = new ArrayList<>();

    //Adds the graphic to the composition.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    
    //Draws the graphic.
    @Override
    public void draw() {
        for (Graphic graphic : childGraphics) {
            graphic.draw();  //Delegation
        }
    }
}