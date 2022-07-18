package decorator.impl.decorator;

import decorator.interfaces.Beverage;
import decorator.interfaces.BeverageDecorator;

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
