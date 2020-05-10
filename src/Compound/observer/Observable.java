package Compound.observer;

import Compound.observer.component.Observer;
import Compound.observer.component.QuackObservable;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {
    private ArrayList observers = new ArrayList();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();

        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
