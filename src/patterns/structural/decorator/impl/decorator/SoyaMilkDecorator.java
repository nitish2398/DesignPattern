package patterns.structural.decorator.impl.decorator;

import patterns.structural.decorator.interfaces.Beverage;
import patterns.structural.decorator.interfaces.BeverageDecorator;

public class SoyaMilkDecorator extends BeverageDecorator {

    public SoyaMilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getName() {
        return "Soya Milk";
    }

    @Override
    public int cost() {
        return super.getBeverage().cost() + 10;
    }
}
