package Strategy.fly;


public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("It's flying with a rocket!!!");
    }
}
