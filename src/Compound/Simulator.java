package Compound;

import Compound.composite.Flock;
import Compound.decorator.QuackCounter;
import Compound.factory.AbstractDuckFactory;
import Compound.factory.CountingDuckFactory;
import Compound.observer.Quackologist;
import Compound.strategy.behavior.Quackable;
import Compound.adapter.GooseAdapter;
import Compound.adapter.Goose;

public class Simulator {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Simulator");
        System.out.println("------------------------------------------------");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("------------------------------------------------");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);

        Flock flockOfDummy = new Flock();
        flockOfDummy.add(duckCall);
        flockOfDummy.add(rubberDuck);

        flockOfDucks.add(flockOfDummy);

        System.out.println("\nSimulator: Whole Flock Simulation");
        System.out.println("------------------------------------------------");

        simulate(flockOfDucks);
        System.out.println("------------------------------------------------");


        System.out.println("\nSimulator: Dummy Flock Simulation");
        System.out.println("------------------------------------------------");

        simulate(flockOfDummy);
        System.out.println("------------------------------------------------");


        System.out.println("\nSimulator: With Quackologist");
        System.out.println("------------------------------------------------");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);
        System.out.println("------------------------------------------------");


        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
