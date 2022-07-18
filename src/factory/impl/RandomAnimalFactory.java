package factory.impl;

import factory.interfaces.Animal;
import factory.interfaces.AnimalFactory;

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
