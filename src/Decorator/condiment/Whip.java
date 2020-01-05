package Decorator.condiment;

import Decorator.Cup;
import Decorator.concrete.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public Cup getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
