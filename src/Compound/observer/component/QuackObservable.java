package Compound.observer.component;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
