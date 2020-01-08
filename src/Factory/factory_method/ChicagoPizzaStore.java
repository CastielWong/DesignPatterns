package Factory.factory_method;

import Factory.factory_method.model.ChicagoStyleCheesePizza;
import Factory.factory_method.model.ChicagoStylePepperoniPizza;
import Factory.factory_method.model.ChicagoStyleVeggiePizza;
import Factory.factory_method.model.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

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
