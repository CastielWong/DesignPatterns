package Compound;

import Compound.strategy.behavior.Quackable;
import Compound.strategy.concrete.DuckCall;
import Compound.strategy.concrete.MallardDuck;
import Compound.strategy.concrete.RedheadDuck;
import Compound.strategy.concrete.RubberDuck;

public class Simulator_1 {

    public static void main(String[] args) {
        Simulator_1 simulator = new Simulator_1();

        simulator.simulate();
    }

    public void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("First Simulator: With Duck Strategy");
        System.out.println("------------------------------------------------\n");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

}
