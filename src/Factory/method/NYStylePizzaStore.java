package Factory.method;

import Factory.method.model.NYStyleCheesePizza;
import Factory.method.model.NYStylePepperoniPizza;
import Factory.method.model.NYStyleVeggiePizza;
import Factory.method.model.Pizza;

public class NYStylePizzaStore extends PizzaStore {

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
