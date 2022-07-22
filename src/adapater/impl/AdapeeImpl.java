package adapater.impl;

import adapater.interfaces.Adaptee;

public class AdapeeImpl implements Adaptee {
    @Override
    public void personalRequest() {
        System.out.println("Hey there, I am " + Adaptee.class.getSimpleName());
    }
}
