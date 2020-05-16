package Strategy.behavior.fly;

import Strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("It can't fly.");
    }

}
