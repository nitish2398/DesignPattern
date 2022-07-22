package patterns.behavioural.strategy.impl;

import patterns.behavioural.strategy.interfaces.FlyStrategy;

public class SimpleFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName());
    }
}
