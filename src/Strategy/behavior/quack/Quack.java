package Strategy.behavior.quack;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("It quacks.");
    }

}
