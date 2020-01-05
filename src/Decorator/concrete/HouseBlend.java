package Decorator.concrete;

import Decorator.Cup;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public HouseBlend(Cup size) {
        super(size);
    }

    @Override
    public Cup getSize() {
        return size;
    }

    @Override
    public double cost() {
        return .89;
    }
}
