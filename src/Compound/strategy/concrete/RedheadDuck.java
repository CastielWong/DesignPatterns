package Compound.strategy.concrete;

import Compound.observer.Observable;
import Compound.observer.component.Observer;
import Compound.strategy.behavior.Quackable;

public class RedheadDuck implements Quackable {
    private Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Redhead Duck";
    }
}
