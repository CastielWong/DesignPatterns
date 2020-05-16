package Strategy.behavior.fly;

import Strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("It flies with wings!");
    }

}
