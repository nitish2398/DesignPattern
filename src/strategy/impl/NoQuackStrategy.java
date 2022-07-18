package strategy.impl;

import strategy.interfaces.QuackStrategy;

public class NoQuackStrategy implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName());
    }
}
