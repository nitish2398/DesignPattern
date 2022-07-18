package decorator;

import decorator.impl.Coffee;
import decorator.impl.Tea;
import decorator.impl.decorator.SoyaMilkDecorator;
import decorator.impl.decorator.SugarFreeDecorator;
import decorator.interfaces.Beverage;

/**
 *
 * Decorator pattern attaches responsibility to an existing object dynamically.
 * Decorator provide flexible alternative to subclassing for extending the functionalities.
 *
 */
public class Main {
    public static void main(String[] args) {
        /**
         * customer = get me a tea with sugar-free crystal
         */
        Beverage sugarFreeTea = new SugarFreeDecorator(new Tea());
        System.out.println(sugarFreeTea.description() + " " + sugarFreeTea.cost());


        /**
         * customer = get me a tea with sugar-free crystal and soya milk
         */
        Beverage sugarFreeAndSoyaTea = new SoyaMilkDecorator(new SugarFreeDecorator(new Tea()));
        System.out.println(sugarFreeAndSoyaTea.description() + " " + sugarFreeAndSoyaTea.cost());

        /**
         * customer = get me a coffee with soya milk
         */
        Beverage SoyaCoffee = new SoyaMilkDecorator(new Coffee());
        System.out.println(SoyaCoffee.description() + " " + SoyaCoffee.cost());
    }
}
