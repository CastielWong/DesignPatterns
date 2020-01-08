package Factory.method;

import Factory.method.model.ChicagoStyleCheesePizza;
import Factory.method.model.ChicagoStylePepperoniPizza;
import Factory.method.model.ChicagoStyleVeggiePizza;
import Factory.method.model.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }

        return null;
    }

}
