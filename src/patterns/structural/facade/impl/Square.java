package patterns.structural.facade.impl;

import patterns.structural.facade.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
