package Factory.factory_method;

import Factory.factory_method.model.NYStyleCheesePizza;
import Factory.factory_method.model.NYStylePepperoniPizza;
import Factory.factory_method.model.NYStyleVeggiePizza;
import Factory.factory_method.model.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }

        return null;
    }
}
