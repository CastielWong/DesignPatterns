package Compound;

import Compound.adapter.Goose;
import Compound.adapter.GooseAdapter;
import Compound.composite.Flock;
import Compound.decorator.QuackCounter;
import Compound.factory.AbstractDuckFactory;
import Compound.factory.CountingDuckFactory;
import Compound.observer.Quackologist;
import Compound.strategy.behavior.Quackable;

public class Simulator_6 {

    public static void main(String[] args) {
        Simulator_6 simulator = new Simulator_6();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Fifth Simulator: With Quacklogist Observer");
        System.out.println("------------------------------------------------\n");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallard_1 = duckFactory.createMallardDuck();
        Quackable mallard_2 = duckFactory.createMallardDuck();
        Quackable mallard_3 = duckFactory.createMallardDuck();
        Quackable mallard_4 = duckFactory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallard_1);
        flockOfMallards.add(mallard_2);
        flockOfMallards.add(mallard_3);
        flockOfMallards.add(mallard_4);

        flockOfDucks.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println(
                String.format("\nThe ducks quacked %d times", QuackCounter.getQuacks())
        );
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

}
