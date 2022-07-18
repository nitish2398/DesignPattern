package factoryMethod.impl;

import factoryMethod.interfaces.Animal;
import factoryMethod.interfaces.AnimalFactory;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        int x = new Random().nextInt(4);
        switch (x) {
            case 1:
                return new Cat();
            case 2:
                return new Dog();
        }
        return new Rabbit();
    }
}
