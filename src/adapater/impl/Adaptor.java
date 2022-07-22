package adapater.impl;

import adapater.interfaces.Adaptee;
import adapater.interfaces.Target;

public class Adaptor implements Target {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * Perform required calculation and use the personal method of Adapee class as per need
     */
    @Override
    public void request() {
        adaptee.personalRequest();
    }
}
