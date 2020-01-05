package Strategy;


import Strategy.fly.FlyNoWay;
import Strategy.quack.Squeak;


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
