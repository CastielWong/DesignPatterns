package Strategy;


import Strategy.fly.FlyNoWay;
import Strategy.quack.Quack;

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
