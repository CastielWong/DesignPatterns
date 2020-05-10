package Compound.factory;

import Compound.strategy.behavior.Quackable;
import Compound.strategy.concrete.DuckCall;
import Compound.strategy.concrete.MallardDuck;
import Compound.strategy.concrete.RedheadDuck;
import Compound.strategy.concrete.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
