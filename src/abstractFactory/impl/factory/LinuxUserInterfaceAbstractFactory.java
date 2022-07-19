package abstractFactory.impl.factory;

import abstractFactory.impl.models.ButtonLinux;
import abstractFactory.impl.models.ViewLinux;
import abstractFactory.interfaces.Button;
import abstractFactory.interfaces.UserInterfaceAbstractFactory;
import abstractFactory.interfaces.View;

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