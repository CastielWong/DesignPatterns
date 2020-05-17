package Factory;

import Factory.abstract_factory.ChicagoPizzaStore;
import Factory.abstract_factory.NYPizzaStore;
import Factory.abstract_factory.PizzaStore;
import Factory.abstract_factory.model.base.Pizza;

public class Simulator_Abstract {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza + "\n");
    }

}


