package Strategy.concrete;

import Strategy.behavior.fly.FlyWithWings;
import Strategy.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.println("It's a real Mallard duck!");
    }

}
