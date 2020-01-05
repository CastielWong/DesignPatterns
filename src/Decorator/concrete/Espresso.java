package Decorator.concrete;

import Decorator.Cup;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public Espresso(Cup size) {
        super(size);
    }

    @Override
    public Cup getSize() {
        return size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
