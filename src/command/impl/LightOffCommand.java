package command.impl;

import command.Light;
import command.interfaces.Command;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.setState(Light.State.OFF);
    }

    @Override
    public void undo() {
        light.setState(Light.State.ON);
    }
}
