package Factory.abstract_factory;

import Factory.abstract_factory.model.base.PizzaIngredientFactory;
import Factory.abstract_factory.model.base.Pizza;
import Factory.abstract_factory.model.concrete.CheesePizza;
import Factory.abstract_factory.model.concrete.NYPizzaIngredientFactory;
import Factory.abstract_factory.model.concrete.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }

        return pizza;
    }

}
