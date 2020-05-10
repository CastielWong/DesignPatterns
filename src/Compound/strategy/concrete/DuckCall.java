package Compound.strategy.concrete;

import Compound.observer.Observable;
import Compound.observer.component.Observer;
import Compound.strategy.behavior.Quackable;

public class DuckCall implements Quackable {
    private Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) { }

    @Override
    public void notifyObservers() { }

    @Override
    public String toString() {
        return "Duck Call";
    }
}
