package patterns.behavioural.observer;

import patterns.behavioural.observer.impl.LcdDisplayScreen;
import patterns.behavioural.observer.impl.PhoneDisplayScreen;
import patterns.behavioural.observer.impl.TemperatureSensor;
import patterns.behavioural.observer.interfaces.Observable;
import patterns.behavioural.observer.interfaces.Observer;

/**
 * There is an event which is in observable. The observable, observe that event change and notify the
 * subscribers/Observers regrading the change.
 *
 * Official definition
 *    The patterns.behavioural.observer pattern defines the one to many dependencies between objects, so that when one object changes its state
 *    other objects are notified automatically.
 */
public class Main {
    /**
     * Create a temperature sensor, who notifies various displays whenever temperature changes.
     */
    public static void main(String[] args) {
        Observable observable = new TemperatureSensor();

        Observer phoneDisplay = new PhoneDisplayScreen();
        Observer lcdDisplay = new LcdDisplayScreen();

        observable.add(phoneDisplay);
        observable.add(lcdDisplay);

        ((TemperatureSensor) observable).updateTemp(2);
        ((TemperatureSensor) observable).updateTemp(5);
        ((TemperatureSensor) observable).updateTemp(5);

        observable.remove(lcdDisplay);

        ((TemperatureSensor) observable).updateTemp(3);

        observable.add(lcdDisplay);

        ((TemperatureSensor) observable).updateTemp(10);
    }
}
