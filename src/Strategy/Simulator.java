package Strategy;


import Strategy.fly.FlyRocketPowered;

public class Simulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("----------------------------------");

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        // reset its fly behavior
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
