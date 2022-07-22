package patterns.structural.adapter;

import patterns.structural.adapter.impl.AdapeeImpl;
import patterns.structural.adapter.impl.Adaptor;
import patterns.structural.adapter.interfaces.Target;

/**
 * Adaptor let class work together which couldn't work together other, due to incompatible interfaces.
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Adaptor(new AdapeeImpl());

        // Target.request actually invokes the adapee methods behind the hood
        target.request();
    }
}
