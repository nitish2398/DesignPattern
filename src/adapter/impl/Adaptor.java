package adapter.impl;

import adapter.interfaces.Adaptee;
import adapter.interfaces.Target;

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
