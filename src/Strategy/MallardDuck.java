package Strategy;


import Strategy.fly.FlyWithWings;
import Strategy.quack.Quack;


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
