package Factory;


import Factory.factory_method.ChicagoPizzaStore;
import Factory.factory_method.NYPizzaStore;
import Factory.factory_method.PizzaStore;
import Factory.factory_method.model.Pizza;

public class Simulator_Method {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza;

        pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

}
