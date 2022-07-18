package observer.impl;

import observer.interfaces.Display;
import observer.interfaces.Observer;

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
