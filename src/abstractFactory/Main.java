package abstractFactory;

import abstractFactory.impl.factory.LinuxUserInterfaceAbstractFactory;
import abstractFactory.impl.factory.MacUserInterfaceAbstractFactory;
import abstractFactory.impl.factory.WindowUserInterfaceAbstractFactory;
import abstractFactory.interfaces.Button;
import abstractFactory.interfaces.UserInterfaceAbstractFactory;
import abstractFactory.interfaces.View;

/**
 * Abstract factory pattern provides an interface for creating families of related and dependent objects.
 *
 * For examples:
 *    we need to create a view and a button for different operating systems.
 *    For Mac we have different view and a corresponding button;
 *    Similarly for windows and linux.
 *
 *    So abstract factory make sure when object A is created, then object B should be of compatible type and
 *    vice-versa.
 *    This design pattern is backbone of dependency injection.
 *
 */
public class Main {
    public static void main(String[] args) {
        UserInterfaceAbstractFactory macFactory = new MacUserInterfaceAbstractFactory();
        UserInterfaceAbstractFactory windowFactory = new WindowUserInterfaceAbstractFactory();
        UserInterfaceAbstractFactory linuxFactory = new LinuxUserInterfaceAbstractFactory();

        /**
         * View and button created with same abstract factory are always compatible.
         */
        View macView = macFactory.getView();
        Button macButton = macFactory.getButton();

        View windowView = windowFactory.getView();
        Button windowButton = windowFactory.getButton();

        View linuxView = linuxFactory.getView();
        Button linuxButton = linuxFactory.getButton();
    }
}
