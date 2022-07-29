package patterns.structural.facade;

/**
 * Facade Pattern provides the unified interface to the set of interfaces in a sub-system.
 * Facade provides a higher level interface that makes the sub-system easier to use.
 */
public class Main {
    /**
     * A is dependent on B
     * B is dependent on C for creation and
     * C is dependent on D and so on
     *
     * Then we have really complex building logic, if client need A then they have to create all the objects
     * themselves.
     *
     * so the facade will provide an interface which will do all the complex work and simply provide A to the client
     */
    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();

        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
    }
}
