package patterns.creational.abstractFactory.impl.factory;

import patterns.creational.abstractFactory.impl.models.ButtonMac;
import patterns.creational.abstractFactory.impl.models.ViewMac;
import patterns.creational.abstractFactory.interfaces.Button;
import patterns.creational.abstractFactory.interfaces.UserInterfaceAbstractFactory;
import patterns.creational.abstractFactory.interfaces.View;

public class MacUserInterfaceAbstractFactory implements UserInterfaceAbstractFactory {
    @Override
    public View getView() {
        return new ViewMac();
    }

    @Override
    public Button getButton() {
        return new ButtonMac();
    }
}