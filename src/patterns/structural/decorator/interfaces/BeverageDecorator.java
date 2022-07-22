package patterns.structural.decorator.interfaces;

public abstract class BeverageDecorator implements Beverage {
    private final Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    protected Beverage getBeverage() {
        return beverage;
    }

    @Override
    public String description() {
        return this.beverage.description() + " And with add-on " + getName();
    }

    protected abstract String getName();
}
