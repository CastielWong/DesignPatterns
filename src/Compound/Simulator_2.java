package Compound;

import Compound.adapter.Goose;
import Compound.adapter.GooseAdapter;
import Compound.strategy.behavior.Quackable;
import Compound.strategy.concrete.DuckCall;
import Compound.strategy.concrete.MallardDuck;
import Compound.strategy.concrete.RedheadDuck;
import Compound.strategy.concrete.RubberDuck;

public class Simulator_2 {

    public static void main(String[] args) {
        Simulator_2 simulator = new Simulator_2();

        simulator.simulate();
    }

    public void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Second Simulator: With Goose Adapter");
        System.out.println("------------------------------------------------\n");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

}
