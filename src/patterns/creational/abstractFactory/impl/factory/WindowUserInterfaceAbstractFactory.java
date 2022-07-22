package patterns.creational.abstractFactory.impl.factory;

import patterns.creational.abstractFactory.impl.models.ButtonWindow;
import patterns.creational.abstractFactory.impl.models.ViewWindow;
import patterns.creational.abstractFactory.interfaces.Button;
import patterns.creational.abstractFactory.interfaces.UserInterfaceAbstractFactory;
import patterns.creational.abstractFactory.interfaces.View;

public class WindowUserInterfaceAbstractFactory implements UserInterfaceAbstractFactory {
    @Override
    public View getView() {
        return new ViewWindow();
    }

    @Override
    public Button getButton() {
        return new ButtonWindow();
    }
}