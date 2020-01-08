package Factory.abstract_factory;

import Factory.abstract_factory.model.ingrdient.type.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Veggies[] createVeggies();
}
