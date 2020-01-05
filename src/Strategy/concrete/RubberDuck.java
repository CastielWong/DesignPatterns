package Strategy.concrete;

import Strategy.behavior.fly.FlyNoWay;
import Strategy.behavior.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("It's a rubber duck.");
    }
}
