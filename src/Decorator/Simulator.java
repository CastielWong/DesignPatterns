package Decorator;

import Decorator.concrete.Beverage;
import Decorator.concrete.Espresso;
import Decorator.concrete.HouseBlend;
import Decorator.condiment.Mocha;
import Decorator.condiment.Soy;
import Decorator.condiment.Whip;

public class Simulator {

    private static void print(Beverage beverage) {
        System.out.println(
                String.format("Cup size: %s\t%s\t$%s",
                        beverage.getSize(),
                        beverage.getDescription(),
                        beverage.cost())
        );
    }

    public static void main(String args[]) {
        Beverage beverage1 = new Espresso();
        print(beverage1);

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        print(beverage2);

        Beverage beverage3 = new HouseBlend(Cup.GRANDE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        print(beverage3);
    }

}
