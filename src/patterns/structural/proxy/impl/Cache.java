package patterns.structural.proxy.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache<K, V> {
    Map<K, V> cache = new ConcurrentHashMap<>();

    V getValue(K key) {
        return cache.getOrDefault(key, null);
    }

    void addValue(K key, V value) {
        cache.put(key, value);
    }
}
