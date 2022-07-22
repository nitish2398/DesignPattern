package command.impl;

import command.Light;
import command.interfaces.Command;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.setState(Light.State.ON);
    }

    @Override
    public void undo() {
        light.setState(Light.State.OFF);
    }
}
