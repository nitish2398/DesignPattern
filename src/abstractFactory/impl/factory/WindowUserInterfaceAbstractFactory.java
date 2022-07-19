package abstractFactory.impl.factory;

import abstractFactory.impl.models.ButtonWindow;
import abstractFactory.impl.models.ViewWindow;
import abstractFactory.interfaces.Button;
import abstractFactory.interfaces.UserInterfaceAbstractFactory;
import abstractFactory.interfaces.View;

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