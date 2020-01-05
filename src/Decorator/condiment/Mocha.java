package Decorator.condiment;

import Decorator.Cup;
import Decorator.concrete.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Cup getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
