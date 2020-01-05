package Strategy.concrete;

import Strategy.behavior.fly.FlyNoWay;
import Strategy.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is just a model duck.");
    }
}
