package Compound.factory;

import Compound.decorator.QuackCounter;
import Compound.strategy.behavior.Quackable;
import Compound.strategy.concrete.DuckCall;
import Compound.strategy.concrete.MallardDuck;
import Compound.strategy.concrete.RedheadDuck;
import Compound.strategy.concrete.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
