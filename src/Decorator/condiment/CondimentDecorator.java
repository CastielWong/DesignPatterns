package Decorator.condiment;

import Decorator.concrete.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
