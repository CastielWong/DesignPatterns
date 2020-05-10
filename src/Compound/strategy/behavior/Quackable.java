package Compound.strategy.behavior;

import Compound.observer.component.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
