package strategy;

import strategy.impl.*;

/**
 * Strategy pattern is about using the encapsulation rather than inheritance. Inheritance does not mean to make code
 * reusable.
 *
 * Official definition: Strategy pattern defines a family of algorithms, encapsulates each one of them
 * and makes them inter-changeable. Strategy lets the algorithm varies independently of the client that uses it.
 *
 * Strategy pattern segregates the normal inheritance (is a relation) to a strategy interface having has a relationship
 * with actual context
 *
 * https://www.youtube.com/watch?v=v9ejT8FO-7I
 *
 *
 * Key point to remember:
 *     1. the actual context does not have multiple implementations.
 *     2. Actual context has various class members of various strategies required.
 *     3. All the strategies can have different implementations.
 */
public class Main {
    /**
     * Duck is our real context which can have multiple types like
     *    1. wild duck - they can be displayed, can quack, can fly
     *    2. Home duck - they can be displayed, can quack, can not fly
     *    3. Rubber duck - they can be displayed, can not quack, can not fly
     *
     *
     *    Now rather than creating three different implementations of duck we have created 3
     *    different strategies for the functionalities and n number of ducks can be implemented in-future.
     *
     */

    public static void main(String[] args) {
        final Duck wildDuck = new Duck(new SimpleDisplayStrategy(), new SimpleQuackStrategy(), new SimpleFlyStrategy());
        final Duck homeDuck = new Duck(new SimpleDisplayStrategy(), new SimpleQuackStrategy(), new NoFlyStrategy());
        final Duck rubberDuck = new Duck(new SimpleDisplayStrategy(), new NoQuackStrategy(), new NoFlyStrategy());

        wildDuck.quack();
        wildDuck.fly();

        System.out.println();

        homeDuck.fly();

        System.out.println();

        rubberDuck.quack();
        rubberDuck.fly();
    }
}
