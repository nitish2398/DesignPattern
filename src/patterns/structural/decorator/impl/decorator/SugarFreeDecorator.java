package patterns.structural.decorator.impl.decorator;

import patterns.structural.decorator.interfaces.Beverage;
import patterns.structural.decorator.interfaces.BeverageDecorator;

public class SugarFreeDecorator extends BeverageDecorator {
    public SugarFreeDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getName() {
        return "Sugar free";
    }

    @Override
    public int cost() {
        return super.getBeverage().cost() + 30;
    }
}