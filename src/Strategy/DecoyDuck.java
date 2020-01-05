package Strategy;


import Strategy.fly.FlyNoWay;
import Strategy.quack.MuteQuack;


public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("It's a decoy...");
    }
}
