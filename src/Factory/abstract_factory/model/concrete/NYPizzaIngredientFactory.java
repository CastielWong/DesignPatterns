package Factory.abstract_factory.model.concrete;

import Factory.abstract_factory.model.base.PizzaIngredientFactory;
import Factory.abstract_factory.model.ingrdient.MarinaraSauce;
import Factory.abstract_factory.model.ingrdient.ReggianoCheese;
import Factory.abstract_factory.model.ingrdient.ThinCrustDough;
import Factory.abstract_factory.model.ingrdient.type.Cheese;
import Factory.abstract_factory.model.ingrdient.type.Dough;
import Factory.abstract_factory.model.ingrdient.type.Sauce;
import Factory.abstract_factory.model.ingrdient.type.Veggies;
import Factory.abstract_factory.model.ingrdient.vegetable.Garlic;
import Factory.abstract_factory.model.ingrdient.vegetable.Mushroom;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {
                new Garlic(),
                new Mushroom()
        };

        return veggies;
    }

}
