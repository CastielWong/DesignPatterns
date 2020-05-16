package Strategy.behavior.quack;

import Strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("It squeaks.");
    }

}
