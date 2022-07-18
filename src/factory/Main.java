package factory;

import factory.impl.RandomAnimalFactory;
import factory.impl.SequentialAnimalFactory;
import factory.interfaces.AnimalFactory;

/**
 * Factory pattern allows the encapsulation and abstraction of the instantiation logic at single place,
 * which can be used to create objects at multiple places in the project.
 *
 * Definition
 *      Factory patten defines an interface for creating the objects.
 *      whereas it's child classes decide which object to create.
 *      Factory binds the creation logic at single place.
 */
public class Main {
    public static void main(String[] args) {
        AnimalFactory randomAnimalFactory = new RandomAnimalFactory();
        AnimalFactory sequentialAnimalFactory = new SequentialAnimalFactory();

        System.out.println("-------- Generate random animals --------");
        for (int i = 0; i < 10; i++) {
            System.out.println(randomAnimalFactory.getAnimal().getClass().getSimpleName());
        }
        System.out.println();
        System.out.println();
        System.out.println("-------- Generate Sequential animals --------");
        for (int i = 0; i < 10; i++) {
            System.out.println(sequentialAnimalFactory.getAnimal().getClass().getSimpleName());
        }
    }
}
