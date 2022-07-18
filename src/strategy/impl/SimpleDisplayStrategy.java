package strategy.impl;

import strategy.interfaces.DisplayStrategy;

public class SimpleDisplayStrategy implements DisplayStrategy {
    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName());
    }
}
