package patterns.behavioural.observer.impl;

import patterns.behavioural.observer.interfaces.Display;
import patterns.behavioural.observer.interfaces.Observer;

public class PhoneDisplayScreen implements Observer, Display {
    @Override
    public void update(String[] args) {
        display(args[0]);
    }

    @Override
    public void display(String message) {
        System.out.println("current Temp = " + message);
    }
}
