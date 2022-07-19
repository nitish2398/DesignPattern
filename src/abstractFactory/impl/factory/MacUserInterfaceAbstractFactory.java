package abstractFactory.impl.factory;

import abstractFactory.impl.models.ButtonMac;
import abstractFactory.impl.models.ViewMac;
import abstractFactory.interfaces.Button;
import abstractFactory.interfaces.UserInterfaceAbstractFactory;
import abstractFactory.interfaces.View;

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