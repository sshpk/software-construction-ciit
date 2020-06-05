package pk.cui.sc.composite.hw;

/** "Leaf" */
class Ellipse implements Graphic {
    //Draws the graphic.
    @Override
    public void draw() {
        System.out.println("Ellipse");
    }
}
