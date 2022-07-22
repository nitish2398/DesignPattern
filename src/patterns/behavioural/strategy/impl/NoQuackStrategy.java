package patterns.behavioural.strategy.impl;

import patterns.behavioural.strategy.interfaces.QuackStrategy;

public class NoQuackStrategy implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName());
    }
}
