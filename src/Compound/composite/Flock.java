package Compound.composite;

import Compound.observer.component.Observer;
import Compound.strategy.behavior.Quackable;

import java.util.ArrayList;

public class Flock implements Quackable {
    private ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public Flock() {

    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }
}
