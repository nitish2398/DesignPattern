package decorator.impl;

import decorator.interfaces.Beverage;

public class Coffee implements Beverage {

    @Override
    public String description() {
        return this.getClass().getSimpleName();
    }

    @Override
    public int cost() {
        return 20;
    }
}
