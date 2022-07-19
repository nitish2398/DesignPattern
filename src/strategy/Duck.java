package strategy;

import strategy.interfaces.DisplayStrategy;
import strategy.interfaces.FlyStrategy;
import strategy.interfaces.QuackStrategy;

/**
 * Context class
 */
public class Duck {
    private final DisplayStrategy displayStrategy;
    private final QuackStrategy quackStrategy;
    private final FlyStrategy flyStrategy;

    public Duck(DisplayStrategy displayStrategy,
                QuackStrategy quackStrategy,
                FlyStrategy flyStrategy) {
        this.displayStrategy = displayStrategy;
        this.quackStrategy = quackStrategy;
        this.flyStrategy = flyStrategy;
    }

    public void display() {
        displayStrategy.display();
    }

    public void quack() {
        quackStrategy.quack();
    }

    public void fly() {
        flyStrategy.fly();
    }
}
