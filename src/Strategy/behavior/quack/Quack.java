package Strategy.behavior.quack;

import Strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("It quacks.");
    }

}
