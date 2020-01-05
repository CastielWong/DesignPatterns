package Strategy.behavior.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("It squeaks.");
    }

}
