package patterns.structural.facade;

import patterns.structural.facade.impl.Circle;
import patterns.structural.facade.impl.Rectangle;
import patterns.structural.facade.impl.Square;
import patterns.structural.facade.interfaces.Shape;

public class ShapeFacade {
    private final Shape circle = new Circle();
    private final Shape rectangle = new Rectangle();
    private final Shape square = new Square();

    void drawCircle() {
        circle.draw();
    }

    void drawRectangle() {
        rectangle.draw();
    }

    void drawSquare() {
        square.draw();
    }
}
