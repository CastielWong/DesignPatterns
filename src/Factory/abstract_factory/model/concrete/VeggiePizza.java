package Factory.abstract_factory.model.concrete;

import Factory.abstract_factory.model.base.PizzaIngredientFactory;
import Factory.abstract_factory.model.base.Pizza;

public class VeggiePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);

		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}

}
