package Compound;

import Compound.adapter.Goose;
import Compound.adapter.GooseAdapter;
import Compound.decorator.QuackCounter;
import Compound.strategy.behavior.Quackable;
import Compound.strategy.concrete.DuckCall;
import Compound.strategy.concrete.MallardDuck;
import Compound.strategy.concrete.RedheadDuck;
import Compound.strategy.concrete.RubberDuck;

public class Simulator_3 {

    public static void main(String[] args) {
        Simulator_3 simulator = new Simulator_3();

        simulator.simulate();
    }

    public void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Third Simulator: With Counter Decorator");
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
