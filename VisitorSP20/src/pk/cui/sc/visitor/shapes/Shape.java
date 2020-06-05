package pk.cui.sc.visitor.shapes;

import pk.cui.sc.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
