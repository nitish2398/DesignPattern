package decorator.impl.decorator;

import decorator.interfaces.Beverage;
import decorator.interfaces.BeverageDecorator;

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