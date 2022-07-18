package observer.impl;

import observer.interfaces.Observable;
import observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Observable {
    List<Observer> observers = new ArrayList<>();
    double prevTemp = 0;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            System.out.println("Notifying = " + observer.getClass().getSimpleName());
            observer.update(new String[]{String.valueOf(prevTemp)});
        });
    }

    public synchronized void updateTemp(double temp) {
        System.out.println("-------------------------------");
        if (prevTemp != temp) {
            prevTemp = temp;
            notifyObservers();
        } else {
            System.out.println("No change");
        }
        System.out.println("-------------------------------");
    }
}
