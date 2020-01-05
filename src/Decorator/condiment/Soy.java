package Decorator.condiment;

import Decorator.Cup;
import Decorator.concrete.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Cup getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if (getSize() == Cup.TALL) {
            cost += .10;
        } else if (getSize() == Cup.GRANDE) {
            cost += .15;
        } else if (getSize() == Cup.VENTI) {
            cost += .20;
        }

        return cost;
    }
}
