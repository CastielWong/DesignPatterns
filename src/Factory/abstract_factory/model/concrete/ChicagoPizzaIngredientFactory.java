package Factory.abstract_factory.model.concrete;

import Factory.abstract_factory.model.base.PizzaIngredientFactory;
import Factory.abstract_factory.model.ingrdient.MozzarellaCheese;
import Factory.abstract_factory.model.ingrdient.PlumTomatoSauce;
import Factory.abstract_factory.model.ingrdient.ThickCrustDough;
import Factory.abstract_factory.model.ingrdient.type.Cheese;
import Factory.abstract_factory.model.ingrdient.type.Dough;
import Factory.abstract_factory.model.ingrdient.type.Sauce;
import Factory.abstract_factory.model.ingrdient.type.Veggies;
import Factory.abstract_factory.model.ingrdient.vegetable.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {
				new Spinach()
		};

		return veggies;
	}

}
