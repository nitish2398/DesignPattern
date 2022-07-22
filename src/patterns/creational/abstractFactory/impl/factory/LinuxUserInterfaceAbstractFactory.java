package patterns.creational.abstractFactory.impl.factory;

import patterns.creational.abstractFactory.impl.models.ButtonLinux;
import patterns.creational.abstractFactory.impl.models.ViewLinux;
import patterns.creational.abstractFactory.interfaces.Button;
import patterns.creational.abstractFactory.interfaces.UserInterfaceAbstractFactory;
import patterns.creational.abstractFactory.interfaces.View;

public class LinuxUserInterfaceAbstractFactory implements UserInterfaceAbstractFactory {
    @Override
    public View getView() {
        return new ViewLinux();
    }

    @Override
    public Button getButton() {
        return new ButtonLinux();
    }
}