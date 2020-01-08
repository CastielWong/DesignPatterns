package Factory.abstract_factory;

import Factory.abstract_factory.model.ingrdient.MarinaraSauce;
import Factory.abstract_factory.model.ingrdient.ReggianoCheese;
import Factory.abstract_factory.model.ingrdient.SlicedPepperoni;
import Factory.abstract_factory.model.ingrdient.ThinCrustDough;
import Factory.abstract_factory.model.ingrdient.type.*;
import Factory.abstract_factory.model.ingrdient.vegetable.Garlic;
import Factory.abstract_factory.model.ingrdient.vegetable.Mushroom;
import Factory.abstract_factory.model.ingrdient.vegetable.Onion;
import Factory.abstract_factory.model.ingrdient.vegetable.RedPepper;

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
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };

        return veggies;
    }
}
