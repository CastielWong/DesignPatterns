package Decorator.condiment;

import Decorator.concrete.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
