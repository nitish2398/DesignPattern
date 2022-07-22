package patterns.creational.factoryMethod.impl;

import patterns.creational.factoryMethod.interfaces.Animal;
import patterns.creational.factoryMethod.interfaces.AnimalFactory;

public class SequentialAnimalFactory implements AnimalFactory {
    int x = 1;

    @Override
    public Animal getAnimal() {
        Animal animal = null;
        synchronized (this) {
            switch (x) {
                case 1:
                    animal = new Cat();
                    break;
                case 2:
                    animal = new Dog();
                    break;
                case 3:
                    animal = new Rabbit();
            }
            if (x == 3) {
                x = 1;
            } else {
                x++;
            }
        }
        return animal;
    }
}
