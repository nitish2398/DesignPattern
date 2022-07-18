package strategy.impl;

import strategy.interfaces.QuackStrategy;

public class SimpleQuackStrategy implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName());
    }
}
