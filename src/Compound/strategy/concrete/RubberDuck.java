package Compound.strategy.concrete;

import Compound.observer.Observable;
import Compound.observer.component.Observer;
import Compound.strategy.behavior.Quackable;

public class RubberDuck implements Quackable {
    private Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) { }

    @Override
    public void notifyObservers() { }

    @Override
    public String toString() {
        return "Rubber Duck";
    }
}
