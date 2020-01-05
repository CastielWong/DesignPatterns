package Decorator.concrete;

import Decorator.Cup;

public abstract class Beverage {
    protected String description = "Unknown Beverage";
    protected Cup size;

    public Beverage() {
        this.size = Cup.TALL;
    }

    public Beverage(Cup size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract Cup getSize();

    public abstract double cost();
}
