package Compound;

import Compound.adapter.Goose;
import Compound.adapter.GooseAdapter;
import Compound.decorator.QuackCounter;
import Compound.factory.AbstractDuckFactory;
import Compound.factory.CountingDuckFactory;
import Compound.strategy.behavior.Quackable;

public class Simulator_4 {

    public static void main(String[] args) {
        Simulator_4 simulator = new Simulator_4();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Fourth Simulator: With Abstract Factory");
        System.out.println("------------------------------------------------\n");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println(
                String.format("\nThe ducks quacked %d times", QuackCounter.getQuacks())
        );
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

}
