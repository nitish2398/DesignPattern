package patterns.behavioural.command.impl;

import patterns.behavioural.command.model.Light;
import patterns.behavioural.command.interfaces.Command;

import java.util.Stack;

public class IntensityControlCommand implements Command {
    private final Light light;
    private final int intensity;
    private final Stack<Integer> prevIntensity = new Stack<>();

    public IntensityControlCommand(Light light, int intensity) {
        this.light = light;
        this.intensity = intensity;
    }

    @Override
    public void execute() {
        this.prevIntensity.push(light.getIntensity());
        light.setIntensity(intensity);
    }

    @Override
    public void undo() {
        if(!this.prevIntensity.empty()) {
            light.setIntensity(prevIntensity.pop());
        }
    }
}
