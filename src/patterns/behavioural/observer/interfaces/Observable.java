package patterns.behavioural.observer.interfaces;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
