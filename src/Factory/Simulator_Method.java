package Factory;


import Factory.method.ChicagoStylePizzaStore;
import Factory.method.NYStylePizzaStore;
import Factory.method.PizzaStore;
import Factory.method.model.Pizza;

public class Simulator_Method {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza;

        pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

}
